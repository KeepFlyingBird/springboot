package cn.freefly.springboot.dto.redis;

/**
 * @ClassNmae ExecMyRedisLock
 * @Author xiao.yunfei
 * @Date 2019/11/19 18:18
 * @Desc
 */
public class ExecMyRedisLock {
    public void execRedisLock(){
        MyRedisLock myRedisLock = new MyRedisLock();
        //上锁
        myRedisLock.lock(this);
        System.out.println("当前线程: " + Thread.currentThread().getName());
        System.out.println("开始执行: " + this.hashCode());
        try {
            System.out.println("doing...");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("完成: " + this.hashCode());
        //解锁
        myRedisLock.unLock(this);
    }
}
