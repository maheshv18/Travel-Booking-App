/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travelagency;

public class TravelAgency {

    public static void main(String[] args) {

        splash Splash = new splash();
        Splash.setVisible(true);
        Introduction Introduction = new Introduction();
        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(50);
                Splash.loadingnum.setText(Integer.toString(i) + "%");
                Splash.loadingbar.setValue(i);
                if (i == 100) {
                    Splash.setVisible(false);
                    Introduction.setVisible(true);
                }
            }

        } catch (Exception e) {

        }
    }
}
