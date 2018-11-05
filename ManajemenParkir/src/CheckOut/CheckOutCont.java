/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CheckOut;

/**
 *
 * @author ASUS
 */
public class CheckOutCont extends CheckOutUI{
    static String noKendaraanCont;
    
    public CheckOutCont(){
        super();
    }
    public void checkOut(){
        this.noKendaraanCont = nomorKendaraan;
    }
    public static void main(String[] args){
     //   System.out.println(CheckOut());
        System.out.println(nomorKendaraan);
    }
    
}
