/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package jframeund3;

//import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
//import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import ClasesPoo.Manzana;
import ClasesPoo.Tomate;
import ClasesPoo.Aguacate;
import ClasesPoo.Uva;
import ClasesPoo.Aceite;
import ClasesPoo.Alimento;
import ClasesPoo.Queso;
import ClasesPoo.Chocolate;
import ClasesPoo.Pescado;
import ClasesPoo.Pan;
import ClasesPoo.Pasta;
import ClasesPoo.Papa;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegistroInventario extends javax.swing.JInternalFrame {

    public DefaultTableModel dtm1;
    public Object[] inventario = new Object[4];
    public int filaSeleccionada = -1;
    public int indice;
    public ImageIcon imagen;
    public Icon icono;
    public ArrayList<String> frutas = new ArrayList<>();
    public ArrayList<String> grasas = new ArrayList<>();
    public ArrayList<String> carbo = new ArrayList<>();
    public ArrayList<Alimento> listaProductos = new ArrayList<>();

    public RegistroInventario() {
        initComponents();
        dtm1 = (DefaultTableModel) tblInventario.getModel();
        // pintarImagen(jLabel6,"src/Imagenes/LOGO_COMPENSAR.jpg");
        frutas.add("Manzana");
        frutas.add("Aguacate");
        frutas.add("Tomate");
        frutas.add("Uva");
        grasas.add("Aceite");
        grasas.add("Chocolate");
        grasas.add("Queso");
        grasas.add("Pescado");
        carbo.add("Pan");
        carbo.add("Papa");
        carbo.add("Pasta");
    }

    public void limpiar() {
        txtCantidad.setText("");
        txtNombre.setText("");
        cmbCate.setSelectedIndex(0);
        cmbTipo.setSelectedIndex(0);
    }

    public boolean esVacio(String texto) {
        boolean bandera = false;
        if (texto.equals("") || texto.equals("Seleccione")) {
            bandera = true;
        }
        return bandera;
    }

    public boolean verNum(String numero) {
        Pattern patron = Pattern.compile("[0-9]*");
        Matcher comprobacion = patron.matcher(numero);
        return comprobacion.matches();
    }

    public boolean verLet(String cadena) {
        Pattern patron = Pattern.compile("[a-zA-Z ñÑáéíóúÁÉÍÓÚ]*");
        Matcher comprobacion = patron.matcher(cadena);
        return comprobacion.matches();
    }

    public boolean verCampos(String tipo, String categoria, String nombre, String cantidad) {
        boolean bandera = true;
        switch (tipo) {
            case "Frutas y Verduras":
                if (frutas.contains(categoria)) {
                    if (categoria.equals("Manzana")) {
                        Manzana nuevaManzana = new Manzana(nombre, Integer.valueOf(cantidad));
                        listaProductos.add(nuevaManzana);
                    } else if (categoria.equals("Aguacate")) {
                        Aguacate nuevoAguacate = new Aguacate(nombre, Integer.valueOf(cantidad));
                        listaProductos.add(nuevoAguacate);
                    } else if (categoria.equals("Uva")) {
                        Uva nuevaUva = new Uva(nombre, Integer.valueOf(cantidad));
                        listaProductos.add(nuevaUva);
                    } else if (categoria.equals("Tomate")) {
                        Tomate nuevoTomate = new Tomate(nombre, Integer.valueOf(cantidad));
                        listaProductos.add(nuevoTomate);
                    }
                } else {
                    bandera = false;
                    JOptionPane.showMessageDialog(rootPane, "!Error¡ La "
                            + "categoría: " + categoria + ", no coincide con el "
                            + "tipo: " + tipo + ".");
                }
                break;
            case "Grasas":
                if (grasas.contains(categoria)) {
                    if (categoria.equals("Aceite")) {
                        Aceite nuevoAceite = new Aceite(nombre, Integer.valueOf(cantidad));
                        listaProductos.add(nuevoAceite);
                    } else if (categoria.equals("Queso")) {
                        Queso nuevoQueso = new Queso(nombre, Integer.valueOf(cantidad));
                        listaProductos.add(nuevoQueso);
                    } else if (categoria.equals("Chocolate")) {
                        Chocolate nuevoChocolate = new Chocolate(nombre, Integer.valueOf(cantidad));
                        listaProductos.add(nuevoChocolate);
                    } else if (categoria.equals("Pescado")) {
                        Pescado nuevoPescado = new Pescado(nombre, Integer.valueOf(cantidad));
                        listaProductos.add(nuevoPescado);
                    }
                } else {
                    bandera = false;
                    JOptionPane.showMessageDialog(rootPane, "!Error¡ La "
                            + "categoría: " + categoria + ", no coincide con el "
                            + "tipo: " + tipo + ".");
                }
                break;
            case "Carbohidratos":
                if (carbo.contains(categoria)) {
                    if (categoria.equals("Pan")) {
                        Pan nuevoPan = new Pan(nombre, Integer.valueOf(cantidad));
                        listaProductos.add(nuevoPan);
                    } else if (categoria.equals("Papa")) {
                        Papa nuevaPapa = new Papa(nombre, Integer.valueOf(cantidad));
                        listaProductos.add(nuevaPapa);
                    } else if (categoria.equals("Pasta")) {
                        Pasta nuevaPasta = new Pasta(nombre, Integer.valueOf(cantidad));
                    }
                } else {
                    bandera = false;
                    JOptionPane.showMessageDialog(rootPane, "!Error¡ La "
                            + "categoría: " + categoria + ", no coincide con el "
                            + "tipo: " + tipo + ".");
                }
                break;
            default:
                break;
        }
        return bandera;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JFormattedTextField();
        cmbTipo = new javax.swing.JComboBox<>();
        btnAgregar1 = new javax.swing.JButton();
        btnEliminar1 = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblInventario = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmbCate = new javax.swing.JComboBox<>();
        Limpiar = new javax.swing.JButton();

        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Nombre Alimento");

        jLabel2.setText("Tipo");

        jLabel3.setText("Cantidad:");

        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });

        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Frutas y Verduras", "Grasas", "Carbohidratos" }));
        cmbTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoActionPerformed(evt);
            }
        });

        btnAgregar1.setText("Agregar/Modificar");
        btnAgregar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar1ActionPerformed(evt);
            }
        });

        btnEliminar1.setText("Eliminar");
        btnEliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminar1ActionPerformed(evt);
            }
        });

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        tblInventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Categoría", "Tipo", "Cantidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblInventarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblInventario);
        if (tblInventario.getColumnModel().getColumnCount() > 0) {
            tblInventario.getColumnModel().getColumn(0).setResizable(false);
            tblInventario.getColumnModel().getColumn(1).setResizable(false);
            tblInventario.getColumnModel().getColumn(2).setResizable(false);
            tblInventario.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setText("Categoría");

        cmbCate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Manzana", "Aguacate", "Uva", "Tomate", "Aceite", "Queso", "Chocolate", "Pescado", "Pan", "Papa", "Pasta" }));

        Limpiar.setText("Limpiar");
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCantidad)
                            .addComponent(cmbCate, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(32, 32, 32)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAgregar1)
                .addGap(38, 38, 38)
                .addComponent(btnEliminar1)
                .addGap(39, 39, 39)
                .addComponent(Limpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCerrar)
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbCate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar1)
                    .addComponent(btnEliminar1)
                    .addComponent(btnCerrar)
                    .addComponent(Limpiar))
                .addGap(56, 56, 56)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void btnAgregar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar1ActionPerformed
        try {
            String nombre = txtNombre.getText();
            String cantidad = txtCantidad.getText();
            String tipo = cmbTipo.getSelectedItem().toString();
            String categoria = cmbCate.getSelectedItem().toString();

            if (esVacio(nombre)) {
                JOptionPane.showMessageDialog(rootPane, "El campo nombre está vacío");
            } else if (!verLet(nombre)) {
                JOptionPane.showMessageDialog(rootPane, "El campo nombre debe contener solo letras");
            } else if (esVacio(tipo)) {
                JOptionPane.showMessageDialog(rootPane, "Seleccione un tipo");
            } else if (esVacio(categoria)) {
                JOptionPane.showMessageDialog(rootPane, "Seleccione una categoría");
            } else if (esVacio(cantidad)) {
                JOptionPane.showMessageDialog(rootPane, "El campo cantidad está vacío");
            } else if (!verNum(cantidad)) {
                JOptionPane.showMessageDialog(rootPane, "El campo cantidad debe contener sólo números");
            } else if (verCampos(tipo, categoria, nombre, cantidad)) {
                if (filaSeleccionada == -1) {
                    for (Alimento producto : listaProductos) {
                        inventario[0] = producto.getNombreAlias();
                        inventario[1] = producto.getNombre();
                        inventario[2] = producto.getTipo();
                        inventario[3] = producto.getCantidad();
                    }
                    dtm1.addRow(inventario);
                    limpiar();
                } else {
                    listaProductos.get(indice).setNombreAlias(txtNombre.getText());
                    listaProductos.get(indice).setTipo(cmbTipo.getSelectedItem().toString());
                    listaProductos.get(indice).setNombre(cmbCate.getSelectedItem().toString());
                    listaProductos.get(indice).setCantidad(Integer.valueOf(txtCantidad.getText()));

                    tblInventario.setValueAt(txtNombre.getText(), filaSeleccionada, 0);
                    tblInventario.setValueAt(cmbTipo.getSelectedItem(), filaSeleccionada, 2);
                    tblInventario.setValueAt(cmbCate.getSelectedItem(), filaSeleccionada, 1);
                    tblInventario.setValueAt(Integer.parseInt(txtCantidad.getText()), filaSeleccionada, 3);
                    filaSeleccionada = -1;
                    limpiar();
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnAgregar1ActionPerformed

    private void btnEliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminar1ActionPerformed
        // TODO add your handling code here:
        int result = JOptionPane.showConfirmDialog(null, "Esta seguro de eliminar el registro", "Advertencia",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        if (result == JOptionPane.YES_OPTION) {
            listaProductos.remove(indice);
            dtm1.removeRow(tblInventario.getSelectedRow());
            limpiar();
        }
    }//GEN-LAST:event_btnEliminar1ActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void tblInventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblInventarioMouseClicked
        // TODO add your handling code here:
        filaSeleccionada = tblInventario.getSelectedRow();

        if (filaSeleccionada != -1) {
            txtNombre.setText(tblInventario.getValueAt(filaSeleccionada, 0).toString());
            cmbCate.setSelectedItem(tblInventario.getValueAt(filaSeleccionada, 1));
            cmbTipo.setSelectedItem(tblInventario.getValueAt(filaSeleccionada, 2));
            txtCantidad.setText(tblInventario.getValueAt(filaSeleccionada, 3).toString());
        }
        for (Alimento producto : listaProductos) {
            if (producto.getNombreAlias().equals(txtNombre.getText())) {
                indice = listaProductos.indexOf(producto);
            }
        }
    }//GEN-LAST:event_tblInventarioMouseClicked

    private void cmbTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTipoActionPerformed

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        // TODO add your handling code here:
        limpiar();
        filaSeleccionada = -1;
    }//GEN-LAST:event_LimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Limpiar;
    private javax.swing.JButton btnAgregar1;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEliminar1;
    private javax.swing.JComboBox<String> cmbCate;
    private javax.swing.JComboBox<String> cmbTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblInventario;
    private javax.swing.JFormattedTextField txtCantidad;
    private javax.swing.JFormattedTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
