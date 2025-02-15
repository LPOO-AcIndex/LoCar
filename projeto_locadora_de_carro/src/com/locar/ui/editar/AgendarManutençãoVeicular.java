package com.locar.ui.editar;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.locar.dados.Repositorio;
import com.locar.entidades.AgendamentoManuntencao;
import com.locar.entidades.Carro;
import com.locar.entidades.Cliente;
import com.locar.regras_negocio.ControladorControleAcesso;
import com.locar.ui.TelaPrincipal;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTable;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class AgendarManutençãoVeicular extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField campoTextoPlaca;
	private JTextField campoTextoMarca;
	private JTextField campoTextoModelo;
	private JTextField campoTextoAno;
	private JTextField campoTextoKmRodados;
	private JTextField campoTextoData;
	private JTextField campoTextoHora;
	private JTable tabela;
	private DefaultTableModel modelo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AgendarManutençãoVeicular frame = new AgendarManutençãoVeicular();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AgendarManutençãoVeicular() {
		setTitle("Agendar Manutenção Veicular");
		setSize(700,700);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Agendamento de manuntenção do veículo");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setBounds(107, 11, 482, 31);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Placa:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(10, 95, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Marca:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(242, 95, 98, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Modelo:");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_1.setBounds(464, 95, 83, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("Veículo");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_2.setBounds(10, 53, 166, 31);
		contentPane.add(lblNewLabel_2);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBounds(0, 82, 684, 2);
		contentPane.add(separator);
		
		JComboBox campoTextoCategoria = new JComboBox();
		campoTextoCategoria.setModel(new DefaultComboBoxModel(new String[] {"Hatch", "Sedan", "SUV", "Picape", "Minivan", "Outro"}));
		campoTextoCategoria.setFont(new Font("Tahoma", Font.PLAIN, 18));
		campoTextoCategoria.setBounds(10, 174, 176, 22);
		contentPane.add(campoTextoCategoria);
		
		campoTextoPlaca = new JTextField();
		campoTextoPlaca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        String placa = campoTextoPlaca.getText();
		        Repositorio repositorio = new Repositorio();
		        Carro carro = repositorio.buscarCarroPorPlaca(placa);
		            
		        campoTextoMarca.setText(carro.getMarca());
		        campoTextoModelo.setText(carro.getModelo());
		        campoTextoAno.setText(String.valueOf(carro.getAno()));
		        campoTextoKmRodados.setText(carro.getKmRodados());
		        campoTextoCategoria.setSelectedItem(carro.getCategoria());
			}
		});
		campoTextoPlaca.setBounds(10, 120, 176, 20);
		contentPane.add(campoTextoPlaca);
		campoTextoPlaca.setColumns(10);
		
		campoTextoMarca = new JTextField();
		campoTextoMarca.setColumns(10);
		campoTextoMarca.setBounds(242, 120, 176, 20);
		contentPane.add(campoTextoMarca);
		
		campoTextoModelo = new JTextField();
		campoTextoModelo.setColumns(10);
		campoTextoModelo.setBounds(464, 120, 176, 20);
		contentPane.add(campoTextoModelo);
		
		JLabel lblNewLabel_1_2 = new JLabel("Categoria:");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_2.setBounds(10, 146, 90, 25);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Ano:");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_2_1.setBounds(242, 149, 46, 14);
		contentPane.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Kilometragem atual:");
		lblNewLabel_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_2_1_1.setBounds(464, 146, 175, 25);
		contentPane.add(lblNewLabel_1_2_1_1);
		
		campoTextoAno = new JTextField();
		campoTextoAno.setColumns(10);
		campoTextoAno.setBounds(242, 175, 176, 20);
		contentPane.add(campoTextoAno);
		
		campoTextoKmRodados = new JTextField();
		campoTextoKmRodados.setColumns(10);
		campoTextoKmRodados.setBounds(464, 175, 176, 20);
		contentPane.add(campoTextoKmRodados);
		
		JLabel lblNewLabel_3 = new JLabel("Detalhes");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_3.setBounds(10, 207, 166, 31);
		contentPane.add(lblNewLabel_3);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLACK);
		separator_1.setBounds(0, 236, 684, 2);
		contentPane.add(separator_1);
		
		JLabel lblNewLabel_1_3 = new JLabel("Tipo de manuntenção:");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_3.setBounds(10, 249, 191, 20);
		contentPane.add(lblNewLabel_1_3);
		
		JComboBox campoTextoTipo = new JComboBox();
		campoTextoTipo.setModel(new DefaultComboBoxModel(new String[] {"Preventiva", "Corretiva"}));
		campoTextoTipo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		campoTextoTipo.setBounds(10, 278, 176, 22);
		contentPane.add(campoTextoTipo);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Data:");
		lblNewLabel_1_3_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_3_1.setBounds(244, 249, 60, 20);
		contentPane.add(lblNewLabel_1_3_1);
		
		JLabel lblNewLabel_1_3_1_1 = new JLabel("Hora:");
		lblNewLabel_1_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_3_1_1.setBounds(464, 249, 60, 20);
		contentPane.add(lblNewLabel_1_3_1_1);
		
		campoTextoData = new JTextField();
		campoTextoData.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
                String textoData = campoTextoData.getText();
                textoData = textoData.replaceAll("[^0-9]", ""); 

                if (textoData.length() >= 2) {
                    textoData = textoData.substring(0, 2) + "/" + textoData.substring(2);
                }
                if (textoData.length() >= 5) {
                    textoData = textoData.substring(0, 5) + "/" + textoData.substring(5);
                }
                if (textoData.length() >= 10) {
                    textoData = textoData.substring(0, 10);
                }

                campoTextoData.setText(textoData);
			}
		});
		campoTextoData.setColumns(10);
		campoTextoData.setBounds(242, 282, 176, 20);
		contentPane.add(campoTextoData);
		
		campoTextoHora = new JTextField();
		campoTextoHora.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
                String textoHora = campoTextoHora.getText();
                textoHora = textoHora.replaceAll("[^0-9]", ""); 

                if (textoHora.length() >= 2) {
                    textoHora = textoHora.substring(0, 2) + ":" + textoHora.substring(2);
                }
                if (textoHora.length() >= 5) {
                    textoHora = textoHora.substring(0, 5);
                }
                campoTextoHora.setText(textoHora);
			}
		});
		campoTextoHora.setColumns(10);
		campoTextoHora.setBounds(464, 282, 176, 20);
		contentPane.add(campoTextoHora);
		
		JLabel textoObservacoes = new JLabel("Observações:");
		textoObservacoes.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textoObservacoes.setBounds(10, 311, 191, 20);
		contentPane.add(textoObservacoes);
		
		JTextArea campoTextoObservacao = new JTextArea();
		campoTextoObservacao.setBounds(10, 342, 482, 35);
		contentPane.add(campoTextoObservacao);
		
		JButton btnNewButton = new JButton("Agendar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				String placa = campoTextoPlaca.getText();
				Repositorio repositorio = new Repositorio();
				Carro carro = repositorio.buscarIdPorPlaca(placa);
				
				String tipoManuntencao = campoTextoTipo.getSelectedItem().toString();
				String data = campoTextoData.getText();
				String hora = campoTextoHora.getText();
				String observacao = campoTextoObservacao.getText();
				
	            ControladorControleAcesso controlador = new ControladorControleAcesso();
	            controlador.registrarAgendamentoManuntencao(carro, tipoManuntencao, data, hora, observacao);
	            
				JOptionPane.showMessageDialog(null, "Agendamento de manuntenção feita com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
			} catch (Exception e1) {
				JOptionPane.showMessageDialog(null, "Erro ao agendar", "Erro", JOptionPane.ERROR_MESSAGE);
			}
			}
				
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(558, 615, 116, 35);
		contentPane.add(btnNewButton);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				campoTextoPlaca.setText("");
				campoTextoMarca.setText("");
				campoTextoModelo.setText("");
				campoTextoAno.setText("");
				campoTextoKmRodados.setText("");
				campoTextoData.setText("");
				campoTextoHora.setText("");
				campoTextoObservacao.setText("");
			}
		});
		btnLimpar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnLimpar.setBounds(440, 615, 107, 35);
		contentPane.add(btnLimpar);
		
		JButton btnNewButton_1 = new JButton("Voltar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaPrincipal telaPrincipal = new TelaPrincipal();
				dispose();
				telaPrincipal.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.setBounds(10, 11, 89, 35);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("Manuntenções anteriores");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_3_1.setBounds(10, 388, 348, 31);
		contentPane.add(lblNewLabel_3_1);
		
        modelo = new DefaultTableModel();
        modelo.addColumn("Id do carro");
        modelo.addColumn("Tipo");
        modelo.addColumn("Data");
        modelo.addColumn("Hora");
        modelo.addColumn("Observação");

        tabela = new JTable(modelo);
        JScrollPane scrollPane = new JScrollPane(tabela);
        scrollPane.setBounds(10, 430, 664, 178);
        contentPane.add(scrollPane);
        
        buscarTodosAgendamentoManuntencao();
	}
	
    private void buscarTodosAgendamentoManuntencao() {
        Repositorio repositorio = new Repositorio();
        List<AgendamentoManuntencao> agendamentosManuntencao = repositorio.buscarTodosAgendamentosManuntencao();
        
        modelo.setRowCount(0); 
        for (AgendamentoManuntencao agendamentoManuntencao : agendamentosManuntencao) {
            modelo.addRow(new Object[]{agendamentoManuntencao.getCarro().getId(), agendamentoManuntencao.getTipoManuntencao(),
            		agendamentoManuntencao.getDataManuntencao(), agendamentoManuntencao.getHora(),
            		agendamentoManuntencao.getObservacao()});
        }
    }
}
