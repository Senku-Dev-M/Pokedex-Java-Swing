/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.softdev.pokedex.vistas;

import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.intellijthemes.FlatMonokaiProIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatSolarizedDarkIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatVuesionIJTheme;
import com.softdev.pokedex.modelos.PokedexCreator;
import com.softdev.pokedex.modelos.Pokemon;
import java.io.File;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import utils.Adapt;

/**
 *
 * @author university
 */
public class MenuPrincipal extends javax.swing.JFrame {

    private static final Map<Integer, Pokemon> pokedex = PokedexCreator.crearPokedex();
    Adapt adapt = new Adapt();
    private static int indicePrimero = 1;
    private static int indiceSegundo = 2;
    private static int indiceTercero = 3;
    Pokemon pokemonPrimero;
    Pokemon pokemonSegundo;
    Pokemon pokemonTercero;
    boolean limite = false;

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
        this.setLocationRelativeTo(this);
        inicializarImagenes();
        initPokemons(indicePrimero, indiceSegundo, indiceTercero);
    }

    public static String obtenerRuta(String nombreImagen) {
        String ubicacionActual = System.getProperty("user.dir");
        String rutaRecursos =
            ubicacionActual + File.separator + "src"
                + File.separator + "main" + File.separator + "java" + File.separator + "resources" + File.separator + "pokemons" + File.separator;
        return rutaRecursos + nombreImagen;
    }


    public static String obtenerID(int id) {
        if (id >= 10) {
            return "#0" + id;
        } else if (id >= 100) {
            return "#" + id;
        } else {
            return "#00" + id;
        }
    }

    public static Pokemon obtenerPokemonPorId(int pokemonId) {
        return pokedex.getOrDefault(pokemonId, null);
    }

    public static Pokemon obtenerPokemonPorNombre(String nombrePokemon) {
        for (Pokemon pokemon : pokedex.values()) {
            if (pokemon.getNombre().equalsIgnoreCase(nombrePokemon)) {
                return pokemon;
            }
        }
        return null;
    }

    public void iniciarPokemon(Pokemon pokemonPrimero) {
        if (pokemonPrimero != null) {
            indicePrimero = pokemonPrimero.getId();
            adapt.setImageLabel(this.imgPokemon1, obtenerRuta(pokemonPrimero.getRutaImagen()));
            this.txtNombre1.setText(pokemonPrimero.getNombre());
            this.txtNumeroId1.setText(String.valueOf(obtenerID(pokemonPrimero.getId())));
            this.txtTipo1.setText(pokemonPrimero.getTipos().toString());
            this.panelPokemon1.setVisible(true);
            this.panelPokemon2.setVisible(false);
            this.panelPokemon3.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this, "Pokemon no encontrado...", "Alerta", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void inicializarImagenes() {
        String ubicacionActual = System.getProperty("user.dir");
        String rutaRecursos =
            ubicacionActual + File.separator + "src"
                + File.separator + "main" + File.separator + "java" + File.separator + "resources" + File.separator;
        String rutaBanner = rutaRecursos + File.separator + "bannertop.jpg";
        String rutaSiguiente = rutaRecursos + File.separator + "icons" + File.separator + "siguiente.png";
        String rutaBuscar = rutaRecursos + File.separator + "icons" + File.separator + "buscador.png";
        String rutaAnterior = rutaRecursos + File.separator + "icons" + File.separator + "anterior.png";
        String rutaRefrescar = rutaRecursos + File.separator + "icons" + File.separator + "refrescar.png";

        adapt.setImageLabel(topBanner, rutaBanner);
        adapt.setImageLabel(btnSiguiente, rutaSiguiente);
        adapt.setImageLabel(btnBuscar, rutaBuscar);
        adapt.setImageLabel(btnAnterior, rutaAnterior);
        adapt.setImageLabel(btnRefrescar, rutaRefrescar);
    }


    public void initPokemons(int posicion1, int posicion2, int posicion3) {
        this.panelPokemon1.setVisible(true);
        this.panelPokemon2.setVisible(true);
        this.panelPokemon3.setVisible(true);
        pokemonPrimero = pokedex.get(posicion1);
        pokemonSegundo = pokedex.get(posicion2);
        pokemonTercero = pokedex.get(posicion3);

        adapt.setImageLabel(this.imgPokemon1, obtenerRuta(pokemonPrimero.getRutaImagen()));
        adapt.setImageLabel(this.imgPokemon2, obtenerRuta(pokemonSegundo.getRutaImagen()));
        adapt.setImageLabel(this.imgPokemon3, obtenerRuta(pokemonTercero.getRutaImagen()));

        this.txtNombre1.setText(pokemonPrimero.getNombre());
        this.txtNombre2.setText(pokemonSegundo.getNombre());
        this.txtNombre3.setText(pokemonTercero.getNombre());

        this.txtNumeroId1.setText(String.valueOf(obtenerID(pokemonPrimero.getId())));
        this.txtNumeroId2.setText(String.valueOf(obtenerID(pokemonSegundo.getId())));
        this.txtNumeroId3.setText(String.valueOf(obtenerID(pokemonTercero.getId())));

        this.txtTipo1.setText(pokemonPrimero.getTipos().toString());
        this.txtTipo2.setText(pokemonSegundo.getTipos().toString());
        this.txtTipo3.setText(pokemonTercero.getTipos().toString());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        top = new javax.swing.JPanel();
        topBanner = new javax.swing.JLabel();
        panelInicio = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JLabel();
        descripcionBuscador = new javax.swing.JLabel();
        btnRefrescar = new javax.swing.JLabel();
        panelPrincipal = new javax.swing.JPanel();
        panelPokemon1 = new javax.swing.JPanel();
        imgPokemon1 = new javax.swing.JLabel();
        txtNumeroId1 = new javax.swing.JLabel();
        txtNombre1 = new javax.swing.JLabel();
        txtTipo1 = new javax.swing.JLabel();
        panelPokemon2 = new javax.swing.JPanel();
        imgPokemon2 = new javax.swing.JLabel();
        txtNumeroId2 = new javax.swing.JLabel();
        txtNombre2 = new javax.swing.JLabel();
        txtTipo3 = new javax.swing.JLabel();
        panelPokemon3 = new javax.swing.JPanel();
        imgPokemon3 = new javax.swing.JLabel();
        txtNumeroId3 = new javax.swing.JLabel();
        txtNombre3 = new javax.swing.JLabel();
        txtTipo2 = new javax.swing.JLabel();
        btnAnterior = new javax.swing.JLabel();
        btnSiguiente = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Principal");
        setMaximumSize(new java.awt.Dimension(1200, 850));
        setMinimumSize(new java.awt.Dimension(1200, 850));
        setPreferredSize(new java.awt.Dimension(1200, 850));
        setResizable(false);
        setSize(new java.awt.Dimension(1200, 850));

        background.setMaximumSize(new java.awt.Dimension(1200, 800));
        background.setMinimumSize(new java.awt.Dimension(1200, 800));
        background.setPreferredSize(new java.awt.Dimension(1200, 800));
        background.setRequestFocusEnabled(false);
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        top.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        topBanner.setToolTipText("");
        top.add(topBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 160));

        background.add(top, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 160));

        titulo.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        titulo.setText("Nombre o número");

        btnBuscar.setBackground(new java.awt.Color(255, 153, 0));
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
        });

        descripcionBuscador.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        descripcionBuscador.setText("Busca un Pokémon por su nombre o usando su número de la Pokédex Nacional.");

        btnRefrescar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRefrescarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelInicioLayout = new javax.swing.GroupLayout(panelInicio);
        panelInicio.setLayout(panelInicioLayout);
        panelInicioLayout.setHorizontalGroup(
            panelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInicioLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(panelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInicioLayout.createSequentialGroup()
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRefrescar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(descripcionBuscador)
                    .addComponent(titulo))
                .addContainerGap(432, Short.MAX_VALUE))
        );
        panelInicioLayout.setVerticalGroup(
            panelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInicioLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(titulo)
                .addGap(18, 18, 18)
                .addGroup(panelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRefrescar, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(descripcionBuscador)
                .addContainerGap())
        );

        background.add(panelInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 1200, 150));

        panelPokemon1.setBackground(new java.awt.Color(153, 0, 0));
        panelPokemon1.setBorder(javax.swing.BorderFactory.createMatteBorder(7, 7, 7, 7, new java.awt.Color(187, 187, 187)));
        panelPokemon1.setForeground(new java.awt.Color(204, 204, 204));
        panelPokemon1.setPreferredSize(new java.awt.Dimension(300, 400));
        panelPokemon1.setRequestFocusEnabled(false);

        imgPokemon1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgPokemon1MouseClicked(evt);
            }
        });

        txtNumeroId1.setForeground(new java.awt.Color(204, 204, 204));
        txtNumeroId1.setText("NumeroPokemon");

        txtNombre1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        txtNombre1.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre1.setText("NombrePokemon");

        txtTipo1.setBackground(new java.awt.Color(255, 0, 0));
        txtTipo1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        txtTipo1.setForeground(new java.awt.Color(255, 255, 255));
        txtTipo1.setText("Tipos..");

        javax.swing.GroupLayout panelPokemon1Layout = new javax.swing.GroupLayout(panelPokemon1);
        panelPokemon1.setLayout(panelPokemon1Layout);
        panelPokemon1Layout.setHorizontalGroup(
            panelPokemon1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPokemon1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panelPokemon1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTipo1)
                    .addComponent(txtNombre1)
                    .addComponent(txtNumeroId1)
                    .addComponent(imgPokemon1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        panelPokemon1Layout.setVerticalGroup(
            panelPokemon1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPokemon1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(imgPokemon1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtNumeroId1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTipo1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelPokemon2.setBackground(new java.awt.Color(153, 0, 0));
        panelPokemon2.setBorder(javax.swing.BorderFactory.createMatteBorder(7, 7, 7, 7, new java.awt.Color(187, 187, 187)));
        panelPokemon2.setPreferredSize(new java.awt.Dimension(300, 400));

        imgPokemon2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgPokemon2MouseClicked(evt);
            }
        });

        txtNumeroId2.setBackground(new java.awt.Color(255, 255, 255));
        txtNumeroId2.setForeground(new java.awt.Color(204, 204, 204));
        txtNumeroId2.setText("NumeroPokemon");

        txtNombre2.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        txtNombre2.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre2.setText("NombrePokemon");

        txtTipo3.setBackground(new java.awt.Color(255, 0, 0));
        txtTipo3.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        txtTipo3.setForeground(new java.awt.Color(255, 255, 255));
        txtTipo3.setText("Tipos..");

        javax.swing.GroupLayout panelPokemon2Layout = new javax.swing.GroupLayout(panelPokemon2);
        panelPokemon2.setLayout(panelPokemon2Layout);
        panelPokemon2Layout.setHorizontalGroup(
            panelPokemon2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPokemon2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panelPokemon2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTipo3)
                    .addComponent(txtNombre2)
                    .addComponent(txtNumeroId2)
                    .addComponent(imgPokemon2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        panelPokemon2Layout.setVerticalGroup(
            panelPokemon2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPokemon2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(imgPokemon2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtNumeroId2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTipo3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelPokemon3.setBackground(new java.awt.Color(153, 0, 0));
        panelPokemon3.setBorder(javax.swing.BorderFactory.createMatteBorder(7, 7, 7, 7, new java.awt.Color(187, 187, 187)));
        panelPokemon3.setPreferredSize(new java.awt.Dimension(300, 400));

        imgPokemon3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgPokemon3MouseClicked(evt);
            }
        });

        txtNumeroId3.setForeground(new java.awt.Color(204, 204, 204));
        txtNumeroId3.setText("NumeroPokemon");

        txtNombre3.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        txtNombre3.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre3.setText("NombrePokemon");

        txtTipo2.setBackground(new java.awt.Color(255, 0, 0));
        txtTipo2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        txtTipo2.setForeground(new java.awt.Color(255, 255, 255));
        txtTipo2.setText("Tipos..");

        javax.swing.GroupLayout panelPokemon3Layout = new javax.swing.GroupLayout(panelPokemon3);
        panelPokemon3.setLayout(panelPokemon3Layout);
        panelPokemon3Layout.setHorizontalGroup(
            panelPokemon3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPokemon3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panelPokemon3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTipo2)
                    .addComponent(txtNombre3)
                    .addComponent(txtNumeroId3)
                    .addComponent(imgPokemon3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        panelPokemon3Layout.setVerticalGroup(
            panelPokemon3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPokemon3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(imgPokemon3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtNumeroId3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTipo2)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        btnAnterior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAnteriorMouseClicked(evt);
            }
        });

        btnSiguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSiguienteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelPokemon1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(panelPokemon2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(panelPokemon3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(210, 210, 210))
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelPokemon3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelPokemon2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelPokemon1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        background.add(panelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 1200, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        try {
            int numero = Integer.parseInt(txtBuscar.getText());

            JOptionPane.showMessageDialog(this, "Buscando Pokemon...", "Información", JOptionPane.INFORMATION_MESSAGE);

            Pokemon pokemonEncontrado = obtenerPokemonPorId(numero);
            iniciarPokemon(pokemonEncontrado);


        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(this, "Buscando Pokemon...");

            Pokemon pokemonEncontrado = obtenerPokemonPorNombre(txtBuscar.getText());
            iniciarPokemon(pokemonEncontrado);
        }

    }//GEN-LAST:event_btnBuscarMouseClicked

    private void btnAnteriorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnteriorMouseClicked
        if (indicePrimero > 1) {
            indicePrimero = indicePrimero - 3;
            indiceSegundo = indiceSegundo - 3;
            indiceTercero = indiceTercero - 3;
            initPokemons(indicePrimero, indiceSegundo, indiceTercero);
            limite = false;
        } else {
            JOptionPane.showMessageDialog(this, "No hay páginas anteriores...", "Alerta", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnAnteriorMouseClicked

    private void btnSiguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSiguienteMouseClicked
        if (limite) {
            JOptionPane.showMessageDialog(this, "No hay páginas siguientes...", "Alerta", JOptionPane.WARNING_MESSAGE);
        } else {
            if (indicePrimero <= 145) {
                indicePrimero = indicePrimero + 3;
                indiceSegundo = indiceSegundo + 3;
                indiceTercero = indiceTercero + 3;
                initPokemons(indicePrimero, indiceSegundo, indiceTercero);
            } else {
                indicePrimero = indicePrimero + 3;
                indiceSegundo = indiceSegundo + 3;
                indiceTercero = indiceTercero + 3;
                iniciarPokemon(obtenerPokemonPorId(151));
                limite = true;
            }

        }

    }//GEN-LAST:event_btnSiguienteMouseClicked

    private void btnRefrescarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRefrescarMouseClicked
        indicePrimero = indiceSegundo - 1;
        initPokemons(indicePrimero, indiceSegundo, indiceTercero);
    }//GEN-LAST:event_btnRefrescarMouseClicked

    private void imgPokemon1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgPokemon1MouseClicked
        FlatVuesionIJTheme.setup();
        Pokemon pokemon = obtenerPokemonPorId(indicePrimero);
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPokemonDetalle(pokemon).setVisible(true);
            }
        });
    }//GEN-LAST:event_imgPokemon1MouseClicked

    private void imgPokemon2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgPokemon2MouseClicked
        FlatVuesionIJTheme.setup();
        Pokemon pokemon = obtenerPokemonPorId(indiceSegundo);
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPokemonDetalle(pokemon).setVisible(true);
            }
        });
    }//GEN-LAST:event_imgPokemon2MouseClicked

    private void imgPokemon3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgPokemon3MouseClicked
        FlatVuesionIJTheme.setup();
        Pokemon pokemon = obtenerPokemonPorId(indiceTercero);
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPokemonDetalle(pokemon).setVisible(true);
            }
        });
    }//GEN-LAST:event_imgPokemon3MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        FlatVuesionIJTheme.setup();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JLabel btnAnterior;
    private javax.swing.JLabel btnBuscar;
    private javax.swing.JLabel btnRefrescar;
    private javax.swing.JLabel btnSiguiente;
    private javax.swing.JLabel descripcionBuscador;
    private javax.swing.JLabel imgPokemon1;
    private javax.swing.JLabel imgPokemon2;
    private javax.swing.JLabel imgPokemon3;
    private javax.swing.JPanel panelInicio;
    private javax.swing.JPanel panelPokemon1;
    private javax.swing.JPanel panelPokemon2;
    private javax.swing.JPanel panelPokemon3;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JLabel titulo;
    private javax.swing.JPanel top;
    private javax.swing.JLabel topBanner;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JLabel txtNombre1;
    private javax.swing.JLabel txtNombre2;
    private javax.swing.JLabel txtNombre3;
    private javax.swing.JLabel txtNumeroId1;
    private javax.swing.JLabel txtNumeroId2;
    private javax.swing.JLabel txtNumeroId3;
    private javax.swing.JLabel txtTipo1;
    private javax.swing.JLabel txtTipo2;
    private javax.swing.JLabel txtTipo3;
    // End of variables declaration//GEN-END:variables
}
