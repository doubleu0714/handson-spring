package io.doubleu0714.spring.core.instantiation;

public class MyBean2 {
    private int val1;
    private String val2;

    public MyBean2(int arg1, String arg2) {
        System.out.println("Instantiation with constructor [" + this.getClass().getName() + "]");
        this.val1 = arg1;
        this.val2 = arg2;
    }
    /**
     * @return the val1
     */
    public int getVal1() {
        return val1;
    }
    /**
     * @param val1 the val1 to set
     */
    public void setVal1(int val1) {
        this.val1 = val1;
    }
    /**
     * @return the val2
     */
    public String getVal2() {
        return val2;
    }
    /**
     * @param val2 the val2 to set
     */
    public void setVal2(String val2) {
        this.val2 = val2;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("MyBean2 {")
          .append("\"val1\": \"").append(getVal1()).append("\",")
          .append("\"val2\": \"").append(getVal2())
          .append("}");
        return sb.toString();
    }
}