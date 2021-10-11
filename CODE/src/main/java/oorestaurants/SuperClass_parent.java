/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oorestaurants;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author MANAN SHAH
 */
public class SuperClass_parent {
    public double sony;
    public double samsung;
    public double MI;
    public double oneplus;
    public double haier;
    public double philips;
    public double LG;
    
    public double apple11pro;
    public double appleXS;
    public double samsungnote10;
    public double samsungnote20;
    public double samsungS20;
    public double realme;
    public double oneplus7;
    
    public double Tv;
    public double mobiles;
    public double totaloftm;
    
    public double alltotaloftm;
   
    
    public double GetAmount()
    {
        Tv = sony + samsung + MI + oneplus + haier + philips + LG;
        mobiles = apple11pro + appleXS + samsungnote10 + samsungnote20 + samsungS20 + realme + oneplus7;
        totaloftm = Tv + mobiles;
        alltotaloftm = totaloftm;
        return alltotaloftm;
    }
    
    private JFrame frame;
    
    public void iExitSystem(){
        frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit","Electronic store managment System",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        } 
    }
    
    //==================================price===================================
    
    public double psony = 71241.0;
    public double psamsung = 94990.0;
    public double pMI = 29999.0;
    public double poneplus = 69899.0;
    public double phaier = 26999.0;
    public double pphilips = 48990.0;
    public double pLG = 52999.0;
    
    public double papple11pro = 109900.0;
    public double pappleXS = 93837.0;
    public double psamsungnote10 = 79999.0;
    public double psamsungnote20 = 104999.0;
    public double psamsungS20 = 97999.0;
    public double prealme = 16999.0;
    public double poneplus7 = 53999.0;
   
    
    //================================x=========================================
    public double mctax=0.90;
    
    public Double cFindtax(double cAmount)
    {
        double Findtax =cAmount -(cAmount *mctax);
        return Findtax;
        
    }
}
