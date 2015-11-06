
package estetica;

import java.sql.ResultSet;
import java.sql.SQLException;


public class citas2 extends javax.swing.JFrame {

   
    public citas2(String s) {
        initComponents();
        conectar con=new conectar();
        ResultSet resultado;
        String hora="";
        for(int i=0;i<=10;i++){
            switch(i){
           case 0:{hora="8:00";break;}
           case 1:{hora="9:00";break;}
           case 2:{hora="10:00";break;}
           case 3:{hora="11:00";break;}
           case 4:{hora="12:00";break;}
           case 5:{hora="1:00";break;}
           case 6:{hora="2:00";break;}
           case 7:{hora="3:00";break;}
           case 8:{hora="4:00";break;}
           case 9:{hora="5:00";break;}
           case 10:{hora="6:00";break;} }  
            
            tabla.setValueAt(hora, i, 0);
            resultado=con.buscar("select * from citas where fecha='"+s+"' and hora='"+hora+"'");
            try{ if(resultado.next()){
                int a=resultado.getInt("id");
                resultado=con.buscar("select * from clientes where id='"+a+"'");
                  try{ if(resultado.next()){
                      tabla.setValueAt((resultado.getString("apaterno")+" "+resultado.getString("amaterno")+" "+resultado.getString("nombres")), i, 1);
                  }
                      
                  }
                  catch(SQLException ex){
                      
                  }
            }else{
              tabla.setValueAt("", i, 1);  
            }
                
            }
            catch(SQLException ex){
                
            }
            
        }
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}

            },
            new String [] {
                "Hora", "Cliente"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        jButton1.setText("cerrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                String a="";
                
                new citas2(a).setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
