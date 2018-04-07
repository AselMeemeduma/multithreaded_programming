/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multi_threaded_programming;

import multi_threaded_programming.runner_objects.Runner;

/**
 *
 * @author Asel
 */
public class Multi_threaded_programming {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Runner first_runner = new Runner("1'st Runner");
        Runner second_runner = new Runner("2'nd Runner");
        
        first_runner.start();
        second_runner.start();
    }
    
}
