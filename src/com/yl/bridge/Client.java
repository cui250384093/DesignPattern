package com.yl.bridge;

/**
 * @author candk
 * @Description
 * @date 4/25/21 - 9:53 AM
 */
public class Client {

    public static void main(String[] args) {
        XiaoMi xiaoMi = new XiaoMi();
        Vivo vivo = new Vivo();
        FoldPhone foldPhone = new FoldPhone(xiaoMi);
        FoldPhone foldPhone1 = new FoldPhone(vivo);
        foldPhone.open();
        foldPhone1.open();
    }
}
