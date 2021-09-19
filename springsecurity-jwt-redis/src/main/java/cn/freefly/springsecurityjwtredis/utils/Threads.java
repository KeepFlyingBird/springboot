package cn.freefly.springsecurityjwtredis.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.*;

/**
 * 线程相关工具类.
 */
public class Threads {
    private static final Logger logger = LoggerFactory.getLogger(Threads.class);

    /**
     * sleep等待,单位为毫秒
     */
    public static void sleep(long milliseconds)
    {
        try
        {
            Thread.sleep(milliseconds);
        }
        catch (InterruptedException e)
        {
            return;
        }
    }

    /**
     * 停止线程池
     * 先使用shutdown, 停止接收新任务并尝试完成所有已存在任务.
     * 如果超时, 则调用shutdownNow, 取消在workQueue中Pending的任务,并中断所有阻塞函数.
     * 如果仍人超時，則強制退出.
     * 另对在shutdown时线程本身被调用中断做了处理.
     */
    public static void shutdownAndAwaitTermination(ExecutorService pool)
    {
        if (pool != null && !pool.isShutdown())
        {
            /**
             * 平滑关闭ExecutorService,当此方法被调用时，ExecutorService停止接收新的任务并且等待已经提交的任务（包含提交正在执行和提交未执行）执行完成。
             * 当所有提交任务执行完毕，线程池即被关闭
             */
            pool.shutdown();
            try
            {
                /**
                 * 接收人timeout和TimeUnit两个参数，用于设定超时时间及单位。当等待超过设定时间时，会监测ExecutorService是否已经关闭，
                 * 若关闭则返回true，否则返回false。一般情况下会和shutdown方法组合使用
                 */
                if (!pool.awaitTermination(120, TimeUnit.SECONDS))
                {
                    //shutdownNow试图停止当前正执行的task，并返回尚未执行的task的list
                    pool.shutdownNow();
                    if (!pool.awaitTermination(120, TimeUnit.SECONDS))
                    {
                        logger.info("Pool did not terminate");
                    }
                }
            }
            catch (InterruptedException ie)
            {
                pool.shutdownNow();
                /**
                 * 只对阻塞线程起作用
                 * 当线程阻塞时，调用interrupt方法后，该线程会得到一个interrupt异常，可以通过对该异常的处理而退出线程
                 * 对于正在运行的线程，没有任何作用！
                 */
                Thread.currentThread().interrupt();
            }
        }
    }

    /**
     * 打印线程异常信息
     */
    public static void printException(Runnable r, Throwable t)
    {
        if (t == null && r instanceof Future<?>)
        {
            try
            {
                Future<?> future = (Future<?>) r;
                if (future.isDone())
                {
                    future.get();
                }
            }
            catch (CancellationException ce)
            {
                t = ce;
            }
            catch (ExecutionException ee)
            {
                t = ee.getCause();
            }
            catch (InterruptedException ie)
            {
                Thread.currentThread().interrupt();
            }
        }
        if (t != null)
        {
            logger.error(t.getMessage(), t);
        }
    }
}
