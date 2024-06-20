package view;

import java.awt.Color;
import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Implantodontia extends JFrame {
    public Implantodontia() {
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
            	Implantodontia.this.setVisible(false);
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

        JLabel lblEspecialidades = new JLabel("Prótese Fixa");
        lblEspecialidades.setForeground(new Color(0, 255, 64));
        lblEspecialidades.setFont(new Font("Agency FB", Font.PLAIN, 34));
        lblEspecialidades.setBounds(33, 130, 147, 60);
        getContentPane().add(lblEspecialidades);

        JTextPane txtpnEspecialidade = new JTextPane();
        txtpnEspecialidade.setFont(new Font("Agency FB", Font.PLAIN, 18));
        txtpnEspecialidade.setBackground(new Color(240, 240, 240));
        txtpnEspecialidade.setText("Essas próteses, como as Coroas e Pontes, são estruturas permanentemente fixadas aos dentes pelo dentista, garantindo segurança, resistência e resultados estéticos superiores, especialmente com o uso de materiais odontológicos de última geração como a cerâmica.");
        txtpnEspecialidade.setBounds(33, 200, 200, 205);
        getContentPane().add(txtpnEspecialidade);        
        
        JLabel lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\bbrun\\eclipse-workspace\\ProjetoDentista\\ProjetoDentista\\src\\view\\Implantodontia.jpg"));
        lblNewLabel_1.setBounds(365, 125, 356, 261);
        getContentPane().add(lblNewLabel_1);

        JButton btnVoltarParaAsEspecialidades = new JButton("Voltar para as Especialidades");
        btnVoltarParaAsEspecialidades.setForeground(Color.BLACK);
        btnVoltarParaAsEspecialidades.setFont(new Font("Agency FB", Font.PLAIN, 16));
        btnVoltarParaAsEspecialidades.setBackground(new Color(0, 255, 64));
        btnVoltarParaAsEspecialidades.setBounds(285, 45, 114, 27);
        btnVoltarParaAsEspecialidades.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	Implantodontia.this.setVisible(false);
                Especialidades especialidades = new Especialidades();
                especialidades.setVisible(true);
            }
        });
        getContentPane().add(btnVoltarParaAsEspecialidades);
        
    }
}
