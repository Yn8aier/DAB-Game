package Project;

import javax.swing.*;
import javax.swing.event.MouseInputAdapter;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class MainFrame_7X7 extends JFrame {

    public static ArrayList<EdgeComponent> getGUIedges() {
        return GUIedges;
    }

    public static void setGUIedges(ArrayList<EdgeComponent> GUIedges) {
        MainFrame_7X7.GUIedges = GUIedges;
    }

    public static ArrayList<DotComponent> getGUIdots() {
        return GUIdots;
    }

    public static void setGUIdots(ArrayList<DotComponent> GUIdots) {
        MainFrame_7X7.GUIdots = GUIdots;
    }

    public Color getCurrentColor() {
        return currentColor;
    }

    public void setCurrentColor(Color currentColor) {
        this.currentColor = currentColor;
    }

    private static ArrayList<EdgeComponent> GUIedges = new ArrayList<>();
    private static ArrayList<DotComponent> GUIdots = new ArrayList<>();

    private Color currentColor;

    public static int getPlayer() {
        return player;
    }

    public static void setPlayer(int player) {
        MainFrame_7X7.player = player;
    }

    private static int player = -1;


    public MainFrame_7X7() {
        super();
        initializeGUI();
        currentColor = Color.RED;
        GameMouseListener mouseListener = new GameMouseListener();
        addMouseListener(mouseListener);
        addMouseMotionListener(mouseListener);
    }

    public void initializeGUI() {

        //The title of the window
        setTitle("GameBoard");
        //the window size
        setSize(1280, 1200);
        // Center the window.
        setLocationRelativeTo(null);
        //end the program if we click the X
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);
       //row1
        GUIedges.add(new EdgeComponent(50, 950, 170, 20));
        GUIedges.add(new EdgeComponent(200, 950, 170, 20));
        GUIedges.add(new EdgeComponent(350, 950, 170, 20));
        GUIedges.add(new EdgeComponent(500, 950, 170, 20));
        GUIedges.add(new EdgeComponent(650, 950, 170, 20));
        GUIedges.add(new EdgeComponent(800, 950, 170, 20));

        //row2
        GUIedges.add(new EdgeComponent(50, 800, 170, 20));
        GUIedges.add(new EdgeComponent(200, 800, 170, 20));
        GUIedges.add(new EdgeComponent(350, 800, 170, 20));
        GUIedges.add(new EdgeComponent(500, 800, 170, 20));
        GUIedges.add(new EdgeComponent(650, 800, 170, 20));
        GUIedges.add(new EdgeComponent(800, 800, 170, 20));
        //row3
        GUIedges.add(new EdgeComponent(50, 650, 170, 20));
        GUIedges.add(new EdgeComponent(200, 650, 170, 20));
        GUIedges.add(new EdgeComponent(350, 650, 170, 20));
        GUIedges.add(new EdgeComponent(500, 650, 170, 20));
        GUIedges.add(new EdgeComponent(650, 650, 170, 20));
        GUIedges.add(new EdgeComponent(800, 650, 170, 20));
        //row4
        GUIedges.add(new EdgeComponent(50, 500, 170, 20));
        GUIedges.add(new EdgeComponent(200, 500, 170, 20));
        GUIedges.add(new EdgeComponent(350, 500, 170, 20));
        GUIedges.add(new EdgeComponent(500, 500, 170, 20));
        GUIedges.add(new EdgeComponent(650, 500, 170, 20));
        GUIedges.add(new EdgeComponent(800, 500, 170, 20));
        //row5

        GUIedges.add(new EdgeComponent(50, 350, 170, 20));
        GUIedges.add(new EdgeComponent(200, 350, 170, 20));
        GUIedges.add(new EdgeComponent(350, 350, 170, 20));
        GUIedges.add(new EdgeComponent(500, 350, 170, 20));
        GUIedges.add(new EdgeComponent(650, 350, 170, 20));
        GUIedges.add(new EdgeComponent(800, 350, 170, 20));
        //row6
        GUIedges.add(new EdgeComponent(50, 200, 170, 20));
        GUIedges.add(new EdgeComponent(200, 200, 170, 20));
        GUIedges.add(new EdgeComponent(350, 200, 170, 20));
        GUIedges.add(new EdgeComponent(500, 200, 170, 20));
        GUIedges.add(new EdgeComponent(650, 200, 170, 20));
        GUIedges.add(new EdgeComponent(800, 200, 170, 20));
        //row7

        GUIedges.add(new EdgeComponent(50, 50, 170, 20));
        GUIedges.add(new EdgeComponent(200, 50, 170, 20));
        GUIedges.add(new EdgeComponent(350, 50, 170, 20));
        GUIedges.add(new EdgeComponent(500, 50, 170, 20));
        GUIedges.add(new EdgeComponent(650, 50, 170, 20));
        GUIedges.add(new EdgeComponent(800, 50, 170, 20));


        //column1
        GUIedges.add(new EdgeComponent(50, 50, 20, 170));
        GUIedges.add(new EdgeComponent(50, 200, 20, 170));
        GUIedges.add(new EdgeComponent(50, 350, 20, 170));
        GUIedges.add(new EdgeComponent(50, 500, 20, 170));
        GUIedges.add(new EdgeComponent(50, 650, 20, 170));
        GUIedges.add(new EdgeComponent(50, 800, 20, 170));
        //column2

        GUIedges.add(new EdgeComponent(200, 50, 20, 170));
        GUIedges.add(new EdgeComponent(200, 200, 20, 170));
        GUIedges.add(new EdgeComponent(200, 350, 20, 170));
        GUIedges.add(new EdgeComponent(200, 500, 20, 170));
        GUIedges.add(new EdgeComponent(200, 650, 20, 170));
        GUIedges.add(new EdgeComponent(200, 800, 20, 170));
        //column3
        GUIedges.add(new EdgeComponent(350, 50, 20, 170));
        GUIedges.add(new EdgeComponent(350, 200, 20, 170));
        GUIedges.add(new EdgeComponent(350, 350, 20, 170));
        GUIedges.add(new EdgeComponent(350, 500, 20, 170));
        GUIedges.add(new EdgeComponent(350, 650, 20, 170));
        GUIedges.add(new EdgeComponent(350, 800, 20, 170));
        //column4
        GUIedges.add(new EdgeComponent(500, 50, 20, 170));
        GUIedges.add(new EdgeComponent(500, 200, 20, 170));
        GUIedges.add(new EdgeComponent(500, 350, 20, 170));
        GUIedges.add(new EdgeComponent(500, 500, 20, 170));
        GUIedges.add(new EdgeComponent(500, 650, 20, 170));
        GUIedges.add(new EdgeComponent(500, 800, 20, 170));
        //column5
        GUIedges.add(new EdgeComponent(650, 50, 20, 170));
        GUIedges.add(new EdgeComponent(650, 200, 20, 170));
        GUIedges.add(new EdgeComponent(650, 350, 20, 170));
        GUIedges.add(new EdgeComponent(650, 500, 20, 170));
        GUIedges.add(new EdgeComponent(650, 650, 20, 170));
        GUIedges.add(new EdgeComponent(650, 800, 20, 170));
        //column6
        GUIedges.add(new EdgeComponent(800, 50, 20, 170));
        GUIedges.add(new EdgeComponent(800, 200, 20, 170));
        GUIedges.add(new EdgeComponent(800, 350, 20, 170));
        GUIedges.add(new EdgeComponent(800, 500, 20, 170));
        GUIedges.add(new EdgeComponent(800, 650, 20, 170));
        GUIedges.add(new EdgeComponent(800, 800, 20, 170));
        //column7
        GUIedges.add(new EdgeComponent(950, 50, 20, 170));
        GUIedges.add(new EdgeComponent(950, 200, 20, 170));
        GUIedges.add(new EdgeComponent(950, 350, 20, 170));
        GUIedges.add(new EdgeComponent(950, 500, 20, 170));
        GUIedges.add(new EdgeComponent(950, 650, 20, 170));
        GUIedges.add(new EdgeComponent(950, 800, 20, 170));
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                DotComponent dotComponent = new DotComponent(50 + 150 * i, 50 + 150 * j, 30);
                getContentPane().add(dotComponent);
            }
        }

        for (EdgeComponent e : GUIedges) {
            e.setVisible(false);
            getContentPane().add(e);
        }
        currentColor = Color.RED;
    }



    private class GameMouseListener extends MouseInputAdapter {


                @Override
        public void mouseClicked(MouseEvent event) {
            //detect the mouse click event
            event = SwingUtilities.convertMouseEvent(MainFrame_7X7.this, event, getContentPane());
            Component component = getContentPane().getComponentAt(event.getPoint());
            if (component instanceof EdgeComponent) {
                EdgeComponent edgeComponent = (EdgeComponent) component;
                if (edgeComponent.isFree()) {
                    if(player == 1){
                        currentColor = Color.RED;
                    }else{
                        currentColor = Color.BLUE;
                    }
                    if(GameStart7.gamemode == 1){
                        currentColor = Color.RED;
                        if(player == 1){
                            currentColor = Color.RED;
                        }else{
                            currentColor = Color.BLUE;
                        }
                        for(int i = 0; i < GUIedges.size(); i++){
                            if(GUIedges.get(i).equals(edgeComponent)){
                                kernal7X7_HU_VS_MA.updateArrays(i);
                                kernal7X7_HU_VS_MA.order.add(i);
                                if (kernal7X7_HU_VS_MA.testFour(kernal7X7_HU_VS_MA.currX, kernal7X7_HU_VS_MA.currY, player) == true) {

                                } else {
                                    player++;
                                }
                            }
                        }
                    }
                    if(GameStart7.gamemode == 2){
                        if(player == 1){
                            currentColor = Color.RED;
                        }else{
                            currentColor = Color.BLUE;
                        }
                        for(int i = 0; i < GUIedges.size(); i++){
                            if(GUIedges.get(i).equals(edgeComponent)){
                                kernal7X7_HU_VS_HU.updateArrays(i);
                                kernal7X7_HU_VS_HU.order.add(i);
                                if (kernal7X7_HU_VS_HU.testFour(kernal7X7_HU_VS_HU.currX, kernal7X7_HU_VS_HU.currY, player) == true) {

                                } else {
                                    if(player == 1){
                                        player++;

                                    }else{
                                        player--;
                                    }
                                }
                            }
                        }
                    }
                    edgeComponent.setColor(currentColor);
                    edgeComponent.setFree(false);
                    edgeComponent.setVisible(true);
                    edgeComponent.repaint();





                }
            }
        }


        //detect the mouse move event
        @Override
        public void mouseMoved(MouseEvent event) {
            event = SwingUtilities.convertMouseEvent(MainFrame_7X7.this, event, getContentPane());
            Component component = getContentPane().getComponentAt(event.getPoint());

            for (EdgeComponent e : GUIedges) {
                if (e.isFree()) {
                    if (e == component) {
                        if(player == 1){
                            currentColor = Color.RED;
                        }else{
                            currentColor = Color.BLUE;
                        }
                        e.setColor(currentColor);
                        e.setVisible(true);
                    } else {
                        e.setVisible(false);
                    }
                }

            }
        }
    }
}
