/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parttime;


public class CommissionBasedPartTime extends PartTime {
  int CommissionPerc;
  CommissionBasedPartTime cb=new CommissionBasedPartTime();
   int calcEarnings()
   {
       
    return(rate*hoursWorked)+CommissionPerc;
}
}
