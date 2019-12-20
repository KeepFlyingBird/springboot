package cn.freefly.springboot.controller;

import cn.freefly.springboot.swagger2.dto.LoanParamBody;
import cn.freefly.springboot.swagger2.dto.ResponseBody;
import io.swagger.annotations.*;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(description = "光大金租接口文档", tags = "光大金租接口")
public class GdjzSwaggerController {

    /**
     * 光大进件
     * @param account
     * @param password
     * @return
     */
    @ApiOperation(
            value = "光大金租进件接口"
            ,notes="步骤1"
            ,consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            ,produces = MediaType.APPLICATION_JSON_UTF8_VALUE
            ,response = String.class)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name",value = "姓名",dataType = "String",required = false),
            @ApiImplicitParam(name = "pass",value = "密码",dataType = "String",required = false)
    })
    @PostMapping("/gdjz/order")
    public String orderApply(@RequestParam(value = "name") String account,@RequestParam(value = "pass") String password){

        return "成功！！";
    }

    @ApiOperation(
            value = "光大金租放款接口"
            ,notes="步骤2"
            ,consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            ,produces = MediaType.APPLICATION_JSON_UTF8_VALUE
            ,response = ResponseBody.class
    )
    @PostMapping("/gdjz/loan")
    public ResponseBody loanApply(@RequestBody @ApiParam(value = "放款申请参数") LoanParamBody loanParamBody){

        return null;
    }
}
