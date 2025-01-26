package test5;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import test1.TelaVeiculos;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JButton;

public class TelaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
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
	public TelaPrincipal() {
		setTitle("Locar - Locadora de Veiculos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 460, 310);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Barra de Menu
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(240, 240, 240));
		menuBar.setBounds(0, 0, 434, 22);
		contentPane.add(menuBar);
		
		//Barra de Menu - Botão Arquivo
		
		JMenu menuArquivo = new JMenu("Arquivo");
		menuBar.add(menuArquivo);
		
		JMenuItem novoClienteMenuItem = new JMenuItem("Novo Cliente");
		menuArquivo.add(novoClienteMenuItem);
		
		novoClienteMenuItem.addActionListener(e -> {
			NovoClienteArquivo telaNovoCliente = new NovoClienteArquivo();
			telaNovoCliente.setVisible(true);
		});
		
		JMenuItem novoVeiculoMenuItem = new JMenuItem("Novo Veículo");
		menuArquivo.add(novoVeiculoMenuItem);
		
		novoVeiculoMenuItem.addActionListener(e -> {
			NovoVeiculoArquivo telaNovoVeiculo = new NovoVeiculoArquivo();
			telaNovoVeiculo.setVisible(true);
		});
		
		JMenuItem novoFuncionarioMenuItem = new JMenuItem("Novo Funcionário");
		menuArquivo.add(novoFuncionarioMenuItem);
		
		novoFuncionarioMenuItem.addActionListener (e -> {
			NovoFuncionarioArquivo telaNovoFuncionario = new NovoFuncionarioArquivo();
			telaNovoFuncionario.setVisible(true);
			
		});
		
		JMenuItem novaLocaçaoMenuItem = new JMenuItem("Nova Locação");
		menuArquivo.add(novaLocaçaoMenuItem);
		
		novaLocaçaoMenuItem.addActionListener(e ->{
			NovaLocaçãoArquivo telaNovaLocaçao = new NovaLocaçãoArquivo();
			telaNovaLocaçao.setVisible(true);
		});
		
		JMenuItem novaReservaArquivo = new JMenuItem("Nova Reserva");
		menuArquivo.add(novaReservaArquivo);
		
		novaReservaArquivo.addActionListener(e -> {
			NovaReservaArquivo telaNovaReserva = new NovaReservaArquivo();
			telaNovaReserva.setVisible(true);
		});
		
		JMenuItem mntmNewMenuItem_8 = new JMenuItem("Sair");
		menuArquivo.add(mntmNewMenuItem_8);
		
		//Barra de Menu - Botão Editar
		
		JMenu menuEditar = new JMenu("Editar");
		menuBar.add(menuEditar);
		
		JMenu submenuCliente = new JMenu ("Gerenciar Cliente");
		menuEditar.add(submenuCliente);
		
		JMenuItem editarCliente = new JMenuItem("Editar Cliente");
		submenuCliente.add(editarCliente);
		
		editarCliente.addActionListener(e -> {
			EditarClienteEditar telaEditarClienteEditar = new EditarClienteEditar();
			telaEditarClienteEditar.setVisible(true);
		});
		
		JMenuItem removerCliente = new JMenuItem("Remover Cliente");
		submenuCliente.add(removerCliente);
		
		removerCliente.addActionListener(e ->{
			RemoverClienteEditar telaRemoverCliente = new RemoverClienteEditar();
			telaRemoverCliente.setVisible(true);
		});
		
		JMenu submenuVeiculo = new JMenu("Gerenciar Veículo");
		
		JMenuItem editarVeiculo = new JMenuItem("Editar Veículo");
		submenuVeiculo.add(editarVeiculo);
		
		editarVeiculo.addActionListener(e -> {
			EditarVeiculoEditar telaEditarVeiculo = new EditarVeiculoEditar();
			telaEditarVeiculo.setVisible(true);
		});
		
		JMenuItem removerVeiculo = new JMenuItem("Remover Veículo");
		submenuVeiculo.add(removerVeiculo);
		
		removerVeiculo.addActionListener(e -> {
			RemoverVeiculoEditar telaRemoverVeiculo = new RemoverVeiculoEditar();
			telaRemoverVeiculo.setVisible(true);
		});
		
		JMenuItem agendarManutençao = new JMenuItem("Agendar Manutenção Veicular");
		submenuVeiculo.add(agendarManutençao);
		
		agendarManutençao.addActionListener(e ->{
			AgendarManutençãoVeicularEditar telaAgendarManutençao = new AgendarManutençãoVeicularEditar();
			telaAgendarManutençao.setVisible(true);
		});
		
		JMenuItem agendarVistoria = new JMenuItem("Agendar Vistoria Veicular");
		submenuVeiculo.add(agendarVistoria);
		
		agendarVistoria.addActionListener(e -> {
			AgendarVistoriaVeicularEditar telaAgendarVistoria = new AgendarVistoriaVeicularEditar();
			telaAgendarVistoria.setVisible(true);
		});
		
		menuEditar.add(submenuVeiculo);
		
		JMenu submenuLocaçoes = new JMenu("Locações");
		
		JMenuItem editarLocaçoesAt = new JMenuItem ("Editar Locações Ativas");
		submenuLocaçoes.add(editarLocaçoesAt);
		
		editarLocaçoesAt.addActionListener(e ->{
			EditarLocAtivaEditar telaEditarLocaçaoAtiva = new EditarLocAtivaEditar();
			telaEditarLocaçaoAtiva.setVisible(true);
		});
		
		JMenuItem editarLocaçoesIn = new JMenuItem ("Editar Locações Inativas");
		submenuLocaçoes.add(editarLocaçoesIn);
		
		editarLocaçoesIn.addActionListener(e ->{
			EditarLocInativaEditar telaEditarLocaçaoInativa = new EditarLocInativaEditar();
			telaEditarLocaçaoInativa.setVisible(true);
		});
		
		menuEditar.add(submenuLocaçoes);
		
		JMenu submenuReservas = new JMenu("Reservas");
		
		JMenuItem editarReservasAt = new JMenuItem ("Editar Reservas Ativas");
		submenuReservas.add(editarReservasAt);
		
		editarReservasAt.addActionListener(e -> {
			EditarReservaAtivaEditar telaEditarReservaAtiva = new EditarReservaAtivaEditar();
			telaEditarReservaAtiva.setVisible(true);
		});
		
		JMenuItem cancelarReservas = new JMenuItem ("Cancelar Reserva");
		submenuReservas.add(cancelarReservas);
		
		cancelarReservas.addActionListener(e -> {
			CancelarReservaEditar telaCancelarReserva = new CancelarReservaEditar();
			telaCancelarReserva.setVisible(true);
		});
		
		menuEditar.add(submenuReservas);
		
		//Barra de Menu - Botão Buscar
		
		JMenu menuBuscar = new JMenu("Buscar");
		menuBar.add(menuBuscar);
		
		JMenuItem buscarCliente = new JMenuItem("Buscar Cliente");
		menuBuscar.add(buscarCliente);
		
		buscarCliente.addActionListener(e -> {
			BuscarClienteBuscar telaBuscarCliente = new BuscarClienteBuscar();
			telaBuscarCliente.setVisible(true);
		});
		
		JMenuItem buscarVeiculo = new JMenuItem("Buscar Veículo");
		menuBuscar.add(buscarVeiculo);
		
		buscarVeiculo.addActionListener(e -> {
			BuscarVeiculoBuscar telaBuscarVeiculo = new BuscarVeiculoBuscar();
			telaBuscarVeiculo.setVisible(true);
		});
		
		JMenuItem buscarFuncionario = new JMenuItem("Buscar Funcionário");
		menuBuscar.add(buscarFuncionario);
		
		buscarFuncionario.addActionListener(e -> {
			BuscarFuncionarioBuscar telaBuscarFuncionario = new BuscarFuncionarioBuscar();
			telaBuscarFuncionario.setVisible(true);
		});
		
		JMenuItem buscarLocaçao = new JMenuItem("Buscar Locação");
		menuBuscar.add(buscarLocaçao);
		
		buscarLocaçao.addActionListener(e -> {
			BuscarLocaçaoBuscar telaBuscarLocaçao = new BuscarLocaçaoBuscar();
			telaBuscarLocaçao.setVisible(true);
		});
		
		JMenuItem buscarReserva = new JMenuItem("Buscar Reserva");
		menuBuscar.add(buscarReserva);
		
		buscarReserva.addActionListener(e ->{
			BuscarReservaBuscar telaBuscarReserva = new BuscarReservaBuscar();
			telaBuscarReserva.setVisible(true);
		});
		
		//Barra de Menu - Botão Relatórios
		
		JMenu menuRelatorios = new JMenu("Relatórios");
		menuBar.add(menuRelatorios);
		
		JMenu menuVisualizar = new JMenu("Visualizar");
		menuRelatorios.add(menuVisualizar);
		
		JMenuItem relLocaçoesAtivas = new JMenuItem("Locações Ativas");
		menuVisualizar.add(relLocaçoesAtivas);
		
		relLocaçoesAtivas.addActionListener(e -> {
			LocaçoesAtivasRelatorios telaRelatoriosLocaçoesAtivas = new LocaçoesAtivasRelatorios();
			telaRelatoriosLocaçoesAtivas.setVisible(true);
		});
		
		JMenuItem relVisualizarReservas = new JMenuItem("Reservas");
		menuVisualizar.add(relVisualizarReservas);
		
		relVisualizarReservas.addActionListener(e -> {
			VisualizarReservasRelatorios telaVisualizarRelatorios = new VisualizarReservasRelatorios();
			telaVisualizarRelatorios.setVisible(true);
		});
		
		JMenuItem relVisualizarClientes = new JMenuItem("Cadastro de Clientes");
		menuVisualizar.add(relVisualizarClientes);
		
		relVisualizarClientes.addActionListener(e -> {
			VisualizarClientesRelatorios telaVisualizarClientes = new VisualizarClientesRelatorios();
			telaVisualizarClientes.setVisible(true);
		});
		
		JMenuItem relVisualizarVeiculos = new JMenuItem("Cadastro de Veículos");
		menuVisualizar.add(relVisualizarVeiculos);
		
		relVisualizarVeiculos.addActionListener(e -> {
			VisualizarVeiculosRelatorios telaVisualizarVeiculos = new VisualizarVeiculosRelatorios();
			telaVisualizarVeiculos.setVisible(true);
		});
		
		JMenuItem relVisualizarFuncionarios = new JMenuItem("Cadastro de Funcionários");
		menuVisualizar.add(relVisualizarFuncionarios);
		
		relVisualizarFuncionarios.addActionListener(e -> {
			VisualizarFuncionariosRelatorios telaVisualizarFuncionarios = new VisualizarFuncionariosRelatorios();
			telaVisualizarFuncionarios.setVisible(true);
		});
		
		JMenu menuGerarRelatorios = new JMenu("Gerar Relatórios");
		menuRelatorios.add(menuGerarRelatorios);
		
		JMenu relReceita = new JMenu("Receita"); //Conversar sobre isso
		menuGerarRelatorios.add(relReceita);
		
		JMenuItem relReceitaDiaria = new JMenuItem("Receita Diaria");
		relReceita.add(relReceitaDiaria);
		
		JMenuItem relReceitaSemanal = new JMenuItem("Receita Semanal");
		relReceita.add(relReceitaSemanal);
		
		JMenuItem relReceitaMensal = new JMenuItem("Receita Mensal");
		relReceita.add(relReceitaMensal);
		
		JMenuItem relReceitaAnual = new JMenuItem("Receita Anual");
		relReceita.add(relReceitaAnual);
		
		JMenuItem relManutençaoVeicular = new JMenuItem("Manutenção Veícular");
		menuGerarRelatorios.add(relManutençaoVeicular);
		
		relManutençaoVeicular.addActionListener(e -> {
			ManutençaoVeicularRelatorios telaManutençaoVeicular = new ManutençaoVeicularRelatorios();
			telaManutençaoVeicular.setVisible(true);
		});
		
		JMenuItem relVistorias = new JMenuItem("Vistorias");
		menuGerarRelatorios.add(relVistorias);
		
		relVistorias.addActionListener(e -> {
			VistoriasRelatorios telaVistorias = new VistoriasRelatorios();
			telaVistorias.setVisible(true);
		});
		
		JMenuItem relLocaçoes = new JMenuItem("Locações");
		menuGerarRelatorios.add(relLocaçoes);
		
		relLocaçoes.addActionListener(e -> {
			LocaçoesRelatorios telaLocaçoes = new LocaçoesRelatorios();
			telaLocaçoes.setVisible(true);
		});
		
		JMenuItem relReservas = new JMenuItem("Reservas");
		menuGerarRelatorios.add(relReservas);
		
		relReservas.addActionListener(e ->{
			ReservasRelatorios telaReservas = new ReservasRelatorios();
			telaReservas.setVisible(true);
		});
		
		//Barra de Menu - Botão Ajuda
		
		JMenu menuAjuda = new JMenu("Ajuda");
		menuBar.add(menuAjuda);
		
		JMenuItem menuHelpMe = new JMenuItem("Help-me!");
		menuAjuda.add(menuHelpMe);
		
		menuHelpMe.addActionListener(e ->{
			HelpMeAjuda telaHelpMe = new HelpMeAjuda();
			telaHelpMe.setVisible(true);
		});
		
		JMenuItem menuSobre = new JMenuItem("Sobre");
		menuAjuda.add(menuSobre);
		
		menuSobre.addActionListener(e -> {
			SobreAjuda telaAjuda = new SobreAjuda();
			telaAjuda.setVisible(true);
		});
		
	}
}
