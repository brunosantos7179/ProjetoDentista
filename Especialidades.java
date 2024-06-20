package view;

import java.awt.Color;
import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Especialidades extends JFrame {
    public Especialidades() {
        getContentPane().setBackground(new Color(240, 240, 240));
        setVisible(true);
        setSize(700, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        getContentPane().setLayout(null);

        JButton btnNewButton = new JButton("Especialidades");
        btnNewButton.setBackground(new Color(0, 255, 64));
        btnNewButton.setForeground(new Color(0, 0, 0));
        btnNewButton.setFont(new Font("Agency FB", Font.PLAIN, 16));
        btnNewButton.setBounds(0, 7, 96, 27);
        getContentPane().add(btnNewButton);

        JButton btnAgendamentos = new JButton("Agendamentos");
        btnAgendamentos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnAgendamentos.setForeground(new Color(0, 0, 0));
        btnAgendamentos.setFont(new Font("Agency FB", Font.PLAIN, 16));
        btnAgendamentos.setBackground(new Color(0, 255, 64));
        btnAgendamentos.setBounds(203, 7, 96, 27);
        getContentPane().add(btnAgendamentos);

        JButton btnInstalacoes = new JButton("Instalações");
        btnInstalacoes.setForeground(new Color(0, 0, 0));
        btnInstalacoes.setFont(new Font("Agency FB", Font.PLAIN, 16));
        btnInstalacoes.setBackground(new Color(0, 255, 64));
        btnInstalacoes.setBounds(492, 7, 89, 27);
        getContentPane().add(btnInstalacoes);

        JButton btnCorpoClinico = new JButton("Corpo Clinico");
        btnCorpoClinico.setForeground(new Color(0, 0, 0));
        btnCorpoClinico.setFont(new Font("Agency FB", Font.PLAIN, 16));
        btnCorpoClinico.setBackground(new Color(0, 255, 64));
        btnCorpoClinico.setBounds(101, 7, 96, 27);
        getContentPane().add(btnCorpoClinico);

        JButton btnConsultas = new JButton("Consultas");
        btnConsultas.setForeground(new Color(0, 0, 0));
        btnConsultas.setFont(new Font("Agency FB", Font.PLAIN, 16));
        btnConsultas.setBackground(new Color(0, 255, 64));
        btnConsultas.setBounds(299, 7, 84, 27);
        getContentPane().add(btnConsultas);

        JButton btnHorarios = new JButton("Horarios");
        btnHorarios.setForeground(new Color(0, 0, 0));
        btnHorarios.setFont(new Font("Agency FB", Font.PLAIN, 16));
        btnHorarios.setBackground(new Color(0, 255, 64));
        btnHorarios.setBounds(588, 7, 96, 27);
        btnHorarios.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Especialidades.this.setVisible(false);
                Horarios horarios = new Horarios();
                horarios.setVisible(true);
            }
        });
        getContentPane().add(btnHorarios);

        JButton btnConvenios = new JButton("Convênios");
        btnConvenios.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnConvenios.setForeground(new Color(0, 0, 0));
        btnConvenios.setFont(new Font("Agency FB", Font.PLAIN, 16));
        btnConvenios.setBackground(new Color(0, 255, 64));
        btnConvenios.setBounds(386, 7, 96, 27);
        getContentPane().add(btnConvenios);

        JLabel lblEspecialidades = new JLabel("Especialidades");
        lblEspecialidades.setForeground(new Color(0, 255, 64));
        lblEspecialidades.setFont(new Font("Agency FB", Font.PLAIN, 34));
        lblEspecialidades.setBounds(33, 130, 147, 60);
        getContentPane().add(lblEspecialidades);

        JTextPane txtpnEspecialidade = new JTextPane();
        txtpnEspecialidade.setFont(new Font("Agency FB", Font.PLAIN, 18));
        txtpnEspecialidade.setBackground(new Color(240, 240, 240));
        txtpnEspecialidade.setText("A Clínica Dentária Maeda dispõe da tecnologia mais avançada e dos melhores profissionais, que o acompanham desde o primeiro momento na clínica, fazendo com que a sua única preocupação seja o seu bem-estar.");
        txtpnEspecialidade.setBounds(33, 200, 200, 205);
        getContentPane().add(txtpnEspecialidade);

        // Positioning the buttons on the right side
        JButton btnOrtodontia = new JButton("Ortodontia");
        btnOrtodontia.setForeground(new Color(0, 0, 0));
        btnOrtodontia.setFont(new Font("Agency FB", Font.PLAIN, 16));
        btnOrtodontia.setBackground(new Color(0, 255, 64));
        btnOrtodontia.setBounds(33, 390, 120, 27);
        btnOrtodontia.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
        		
            	Especialidades.super.setVisible(false);
        		Ortodontia ortodontia = new Ortodontia();
                ortodontia.setVisible(true);
        		
        	}
        });
        getContentPane().add(btnOrtodontia);
        
        JButton btnImplantodontia = new JButton("Implantodontia");
        btnImplantodontia.setForeground(new Color(0, 0, 0));
        btnImplantodontia.setFont(new Font("Agency FB", Font.PLAIN, 16));
        btnImplantodontia.setBackground(new Color(0, 255, 64));
        btnImplantodontia.setBounds(33, 440, 120, 27);
        btnImplantodontia.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
        		
            	Especialidades.super.setVisible(false);
        		Implantodontia implantodontia = new Implantodontia();
                implantodontia.setVisible(true);
        		
        	}
        });
        getContentPane().add(btnImplantodontia);
        
        JButton btnProteseFixa = new JButton("Prótese Fixa");
        btnProteseFixa.setForeground(new Color(0, 0, 0));
        btnProteseFixa.setFont(new Font("Agency FB", Font.PLAIN, 16));
        btnProteseFixa.setBackground(new Color(0, 255, 64));
        btnProteseFixa.setBounds(180, 390, 120, 27);
        btnProteseFixa.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
        		
            	Especialidades.super.setVisible(false);
            	ProteseFixa protesefixa = new ProteseFixa();
            	protesefixa.setVisible(true);
        		
        	}
        });
        getContentPane().add(btnProteseFixa);
        
        JButton btnProteseRemovivel = new JButton("Prótese Removível");
        btnProteseRemovivel.setForeground(new Color(0, 0, 0));
        btnProteseRemovivel.setFont(new Font("Agency FB", Font.PLAIN, 16));
        btnProteseRemovivel.setBackground(new Color(0, 255, 64));
        btnProteseRemovivel.setBounds(180, 440, 120, 27);
        btnProteseRemovivel.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
        		
            	Especialidades.super.setVisible(false);
            	ProteseRemovivel proteseremovivel = new ProteseRemovivel();
            	proteseremovivel.setVisible(true);
        		
        	}
        });
        getContentPane().add(btnProteseRemovivel);
        
        JLabel lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\bbrun\\eclipse-workspace\\ProjetoDentista\\ProjetoDentista\\src\\view\\Especialidades.jpg"));
        lblNewLabel_1.setBounds(400, 125, 356, 261);
        getContentPane().add(lblNewLabel_1);

        JButton btnVoltarAoInicio = new JButton("Voltar Ao Inicio");
        btnVoltarAoInicio.setForeground(Color.BLACK);
        btnVoltarAoInicio.setFont(new Font("Agency FB", Font.PLAIN, 16));
        btnVoltarAoInicio.setBackground(new Color(0, 255, 64));
        btnVoltarAoInicio.setBounds(285, 45, 114, 27);
        btnVoltarAoInicio.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Especialidades.this.setVisible(false);
                Home home = new Home();
                home.setVisible(true);
            }
        });
        getContentPane().add(btnVoltarAoInicio);
        
    }
}
