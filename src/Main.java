/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


public class Main {


    public static void main(String[] args) {
        
        Thread t = new Thread(new MyRunnable());
        t.start();
        
        
        t.interrupt();
    }
    
}