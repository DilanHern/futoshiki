package Componentes;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.RenderingHints;
import java.awt.geom.RoundRectangle2D;
import javax.swing.ButtonModel;
import javax.swing.JButton;

/**
 * La clase RondedBordes representa un componente gráfico personalizado con bordes redondeados.
 * Extiende la funcionalidad de un componente Swing para proporcionar una apariencia visual mejorada.
 */
public class BotonRedondo extends JButton{

    //atributos
    private Color color1 = new Color(0x666f7f);
    private Color color2 = new Color(0x262d3d);
    private Color color3 = new Color(0x262d3d);

    /**
     * Constructor de la clase RondedBordes.
     * Inicializa los componentes del panel con bordes redondeados.
     */
    public BotonRedondo() {
        setOpaque(false);
        setContentAreaFilled(false);
        setForeground(Color.WHITE);
        setFocusPainted(false);
        setBorderPainted(false);
    }

    /**
     * Pinta el componente con bordes redondeados.
     * Configura el estilo de pintura y dibuja el componente con un gradiente de colores.
     *
     * @param g El objeto Graphics utilizado para dibujar el componente.
     */
    protected void paintComponent(Graphics g) {
        Color c1,c2,c3;
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        ButtonModel m = getModel();

         Paint oldPaint = g2.getPaint();
        if (m.isArmed()){
           c2=getColor1().darker();
           c1=getColor2().darker();
           c3=getColor3();
        }else{
           c1=getColor1().darker();
           c2=getColor2().darker();
           c3=getColor3().brighter();
        }
        if (!m.isEnabled()){
           c2=getColor1().brighter();
           c1=getColor2().brighter();
           c3=getColor3().darker();
        }
          RoundRectangle2D.Float r2d = new RoundRectangle2D.Float(
                    0,0,getWidth(),getHeight()-1,48, 48);
            g2.clip(r2d);
            g2.setPaint(new GradientPaint(0.0f, 0.0f, c1,
                    0.0f, getHeight(), c2));
            g2.fillRect(0,0,getWidth(),getHeight());

            g2.setStroke(new BasicStroke(4f));
            g2.setPaint(new GradientPaint(0.0f, 0.0f, c3,
                    0.0f, getHeight(), c3));
            g2.drawRoundRect(0, 0, getWidth()-2 , getHeight() -2, 50, 50);

        g2.setPaint(oldPaint);
        super.paintComponent(g);
    }

    /**
     * @return the color1
     */
    public Color getColor1() {
        return color1;
    }

    /**
     * @param color1 the color1 to set
     */
    public void setColor1(Color color1) {
        this.color1 = color1;
    }

    /**
     * @return the color2
     */
    public Color getColor2() {
        return color2;
    }

    /**
     * @param color2 the color2 to set
     */
    public void setColor2(Color color2) {
        this.color2 = color2;
    }

    /**
     * @return the color3
     */
    public Color getColor3() {
        return color3;
    }

    /**
     * @param color3 the color3 to set
     */
    public void setColor3(Color color3) {
        this.color3 = color3;
    }




}
