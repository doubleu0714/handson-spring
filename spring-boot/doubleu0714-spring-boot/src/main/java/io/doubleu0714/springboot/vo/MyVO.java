package io.doubleu0714.springboot.vo;

public class MyVO {
    // private static final long serialVersionUID = 6319598360469709841L;
	private String stringVal;
    private int intVal;
    private byte[] byteArr;
    private MyVO nextMyVO;

    public MyVO () {

    }
    public MyVO (String stringVal, int intVal) {
        setStringVal(stringVal);
        setIntVal(intVal);
    }
    public String getStringVal() {
        return this.stringVal;
    }
    
    public void setStringVal(String stringVal) {
        this.stringVal = stringVal;
    }

    public int getIntVal() {
        return this.intVal;
    }
    
    public void setIntVal(int intVal) {
        this.intVal = intVal;
    }

    public byte[] getByteArr() {
        return this.byteArr;
    }
    
    public void setByteArr(byte[] byteArr) {
        this.byteArr = byteArr;
    }

    public MyVO getNextMyVO() {
        return this.nextMyVO;
    }
    
    public void setNextMyVO(MyVO nextMyVO) {
        this.nextMyVO = nextMyVO;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("{");
        sb.append("\"intVal\" : " + getIntVal());
        sb.append(", ");
        sb.append("\"stringVal\" : \"" + getStringVal() + "\"");
        sb.append(", ");
        sb.append("\"byteArr\" : \"" + getByteArr() + "\"");
        if (this.getNextMyVO() != null) {
            sb.append(", ");
            sb.append(this.getNextMyVO());
        }
        sb.append("}");
        return sb.toString();
    }
}