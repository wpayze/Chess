package paizchess;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

public final class tablero extends javax.swing.JFrame implements ActionListener 
{
    //Variables
    public casilla box[][] = new casilla[8][8]; //Casillas
    public ImageIcon pieza[] = new ImageIcon[12]; //Imagenes
    public int conf = 0; 
    
    public tablero() 
    {
        initComponents();
        CrearCasillas();
        IniciarPiezas();
        ColocarPiezas();
    }
    
    //Se crean as 64 casillas, y les da color.
    public void CrearCasillas()
    {
        
        
        for(int i = 0 ;i < 8; i++)
        {
                if (i%2 == 0)
                {
                    conf = 0;
                }
                else
                {
                    conf = 1;
                }
            
            for(int j = 0; j < 8;j++)
            {
                
                box[i][j] = new casilla();
                
                box[i][j].a.setBounds((i*60)+6, (j*60)+6, 60, 60);
                
                box[i][j].a.addActionListener(this);
                
                //Casillas Claras
                if (conf%2 == 0)
                {
                    box[i][j].a.setBackground(java.awt.Color.white);
                    conf++;
                }
                //Casillas Oscuras
                else
                {
                    box[i][j].a.setBackground(java.awt.Color.gray);
                    conf++;
                }
                
                if (j == 7)
                {
                    conf = 1;
                }
                                
                this.add(box[i][j].a);
            }
        }  
    }
    
    //Inicializa las imagenes de las piezas.
    public void IniciarPiezas()
    {
        //Reyes
        pieza[0] = new ImageIcon(this.getClass().getResource("/Icons/reyblanco.png"));
        pieza[1] = new ImageIcon(this.getClass().getResource("/Icons/reynegro.png"));
        //Damas
        pieza[2] = new ImageIcon(this.getClass().getResource("/Icons/damablanca.png"));
        pieza[3] = new ImageIcon(this.getClass().getResource("/Icons/damanegra.png"));
        //Torres
        pieza[4] = new ImageIcon(this.getClass().getResource("/Icons/torreblanca.png"));
        pieza[5] = new ImageIcon(this.getClass().getResource("/Icons/torrenegra.png"));
        //Alfiles
        pieza[6] = new ImageIcon(this.getClass().getResource("/Icons/alfilblanco.png"));
        pieza[7] = new ImageIcon(this.getClass().getResource("/Icons/alfilnegro.png"));
        //Caballos
        pieza[8] = new ImageIcon(this.getClass().getResource("/Icons/caballoblanco.png"));
        pieza[9] = new ImageIcon(this.getClass().getResource("/Icons/caballonegro.png"));
        //Peones
        pieza[10] = new ImageIcon(this.getClass().getResource("/Icons/peonblanco.png"));
        pieza[11] = new ImageIcon(this.getClass().getResource("/Icons/peonnegro.png"));
    }
    
    //Coloca las imagenes en su sitio.
    public void ColocarPiezas()
    {
         //Reyes
        box[4][7].a.setIcon(pieza[0]);
        box[4][0].a.setIcon(pieza[1]);
        
        //Damas
        box[3][7].a.setIcon(pieza[2]);
        box[3][0].a.setIcon(pieza[3]);
        
        //Torres
        box[0][7].a.setIcon(pieza[4]);
        box[7][7].a.setIcon(pieza[4]);
        box[0][0].a.setIcon(pieza[5]);
        box[7][0].a.setIcon(pieza[5]);
        
        //Alfiles
        box[2][7].a.setIcon(pieza[6]);
        box[5][7].a.setIcon(pieza[6]);
        box[2][0].a.setIcon(pieza[7]);
        box[5][0].a.setIcon(pieza[7]);
        
        //Caballos
        box[1][7].a.setIcon(pieza[8]);
        box[6][7].a.setIcon(pieza[8]);
        box[1][0].a.setIcon(pieza[9]);
        box[6][0].a.setIcon(pieza[9]);
        
        //Peones
        for (int i = 0; i < 8; i++) 
        
        {
            box[i][1].a.setIcon(pieza[11]);
            box[i][6].a.setIcon(pieza[10]);
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        /*for(int i=0;i<8;i++) 
        {
           for(int j = 0;j <8; j++)
           {
               
               if (e.getSource() == box[i][j].a)
               {
                 
               String iconaux = box[i][j].a.getIcon().toString();
               
               if (iconaux.endsWith("peonblanco.png"))
               {
                   if ((j == (jx-1) || j == (jx-2)) && toque == 1) 
                   {
                       box[ix][jx].a.setIcon(null);
                       box[i][j].a.setIcon(pieza[10]);
                   }
                   else
                   {
                        box[i][j-1].a.setBackground(java.awt.Color.blue);
                        box[i][j-2].a.setBackground(java.awt.Color.blue);  
                   }
                   
                   toque = 1;
               }
               else if (iconaux.endsWith("caballoblanco.png"))
               {
                    box[i+1][j-2].a.setBackground(java.awt.Color.blue);
                    box[i-1][j-2].a.setBackground(java.awt.Color.blue); 
                    toque=2;
               }
               
               ix = i;
               jx = j;
               
               
               }
           }*/
        }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 725, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 507, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
