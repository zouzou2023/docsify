package com.qianfeng.goodscommons.vo;

/**
 * 向前端返回需要的结果  包含：状态码、提示信息、返回值等
 */
public class ResultVo {

    private int code;
    private String msg;
    private Object data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
    private ResultVo(){}

    /**
     * 成功
     */
    public static ResultVo ok(Object data){
        ResultVo resultVo = new ResultVo();
        resultVo.setCode(200);
        resultVo.setMsg("ok");
        resultVo.setData(data);
        return resultVo;
    }
    public static ResultVo ok(){
        return ResultVo.ok(null);
    }
    /**
     * 失败
     */
    public static ResultVo error(){
        ResultVo resultVo = new ResultVo();
        resultVo.setCode(500);
        resultVo.setMsg("error");
        return resultVo;
    }
    public static ResultVo error(String msg){
        ResultVo resultVo = new ResultVo();
        resultVo.setCode(500);
        resultVo.setMsg(msg);
        return resultVo;
    }
}
