/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class MyRunnable  implements Runnable {
    
    @Override
    public void run() {
        try {
            System.out.println(1);
            Thread.sleep(1000);
            System.out.println(2);
        } catch (InterruptedException exception) {
            System.out.println(3);
        }
        System.out.println(4);
    }
}
