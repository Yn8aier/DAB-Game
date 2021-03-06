package Project;

import javax.swing.*;
import javax.swing.event.MouseInputAdapter;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class MainFrame_3X3 extends JFrame {

    public static ArrayList<EdgeComponent> getGUIedges() {
        return GUIedges;
    }

    public static void setGUIedges(ArrayList<EdgeComponent> GUIedges) {
        MainFrame_3X3.GUIedges = GUIedges;
    }

    public static ArrayList<DotComponent> getGUIdots() {
        return GUIdots;
    }

    public static void setGUIdots(ArrayList<DotComponent> GUIdots) {
        MainFrame_3X3.GUIdots = GUIdots;
    }

    public Color getCurrentColor() {
        return currentColor;
    }

    public void setCurrentColor(Color currentColor) {
        this.currentColor = currentColor;
    }

    private static ArrayList<EdgeComponent> GUIedges = new ArrayList<>();
    private static ArrayList<DotComponent> GUIdots = new ArrayList<>();
    public static Color currentColor;

    public static int getPlayer() {
        return player;
    }

    public static void setPlayer(int player) {
        MainFrame_3X3.player = player;
    }

    private static int player = -1;


    public MainFrame_3X3() {
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
        setSize(580, 600);
        // Center the window.
        setLocationRelativeTo(null);
        //end the program if we click the X
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);

        //row1
        GUIedges.add(new EdgeComponent(50, 450, 220, 20));
        GUIedges.add(new EdgeComponent(250, 450, 220, 20));
        //row2
        GUIedges.add(new EdgeComponent(50, 250, 220, 20));
        GUIedges.add(new EdgeComponent(250, 250, 220, 20));
        //row3
        GUIedges.add(new EdgeComponent(50, 50, 220, 20));
        GUIedges.add(new EdgeComponent(250, 50, 220, 20));
        //column1
        GUIedges.add(new EdgeComponent(50, 250, 20, 220));
        GUIedges.add(new EdgeComponent(50, 50, 20, 220));
        //column2
        GUIedges.add(new EdgeComponent(250, 250, 20, 220));
        GUIedges.add(new EdgeComponent(250, 50, 20, 220));
        //column3
        GUIedges.add(new EdgeComponent(450, 250, 20, 220));
        GUIedges.add(new EdgeComponent(450, 50, 20, 220));


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                DotComponent dotComponent = new DotComponent(50 + 200 * i, 50 + 200 * j, 40);
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
            event = SwingUtilities.convertMouseEvent(MainFrame_3X3.this, event, getContentPane());
            Component component = getContentPane().getComponentAt(event.getPoint());
            if (component instanceof EdgeComponent) {
                EdgeComponent edgeComponent = (EdgeComponent) component;
                if (edgeComponent.isFree()) {
                    if(player == 1){
                        currentColor = Color.RED;
                    }else{
                        currentColor = Color.BLUE;
                    }
                    if(GameStart3.gamemode == 1){
                        currentColor = Color.RED;
                        if(player == 1){
                            currentColor = Color.RED;
                        }else{
                            currentColor = Color.BLUE;
                        }
                        for(int i = 0; i < GUIedges.size(); i++){
                            if(GUIedges.get(i).equals(edgeComponent)){
                                kernal3X3_HU_VS_MA.updateArrays(i);
                                kernal3X3_HU_VS_MA.order.add(i);
                                if (kernal3X3_HU_VS_MA.testFour(kernal3X3_HU_VS_MA.currX, kernal3X3_HU_VS_MA.currY, player) == true) {

                                } else {
                                    player++;
                                }
                            }
                        }
                    }
                    if(GameStart3.gamemode == 2){
                        if(player == 1){
                            currentColor = Color.RED;
                        }else{
                            currentColor = Color.BLUE;
                        }
                        for(int i = 0; i < GUIedges.size(); i++){
                            if(GUIedges.get(i).equals(edgeComponent)){
                                kernal3X3_HU_VS_HU.updateArrays(i);
                                kernal3X3_HU_VS_HU.order.add(i);
                                if (kernal3X3_HU_VS_HU.testFour(kernal3X3_HU_VS_HU.currX, kernal3X3_HU_VS_HU.currY, player) == true) {

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
            event = SwingUtilities.convertMouseEvent(MainFrame_3X3.this, event, getContentPane());
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
