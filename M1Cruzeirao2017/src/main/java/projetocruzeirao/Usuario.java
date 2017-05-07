package projetocruzeirao;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Usuario {
	
	private String email;
	private String nome;
	private Calendar dataNasimento;
	private List<Equipe> equipes;
	private List<Inscrito> inscricoes;
	private List<Campeonato> campeonatos;
	private Enum tipo;
	private String telefoneFixo;
	private String telefoneMovel;
	private String endereco;
	private String rg;
	private String cpf;
	private String cref;
	private Enum sexo;
	private String foto;
	
	
	public Usuario(){
		equipes = new ArrayList<Equipe>();
		inscricoes = new ArrayList<Inscrito>();
		campeonatos = new ArrayList<Campeonato>();
	}


	public void addEquipe(Equipe e)
	{
		equipes.add(e);
	}
	
	public void addIinscricao(Inscrito i)
	{
		inscricoes.add(i);
	}
	
	public void addCampeonato(Campeonato c)
	{
		campeonatos.add(c);
	}
	
	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Calendar getDataNasimento() {
		return dataNasimento;
	}


	public void setDataNasimento(Calendar dataNasimento) {
		this.dataNasimento = dataNasimento;
	}


	public Enum getTipo() {
		return tipo;
	}


	public void setTipo(Enum tipo) {
		this.tipo = tipo;
	}


	public String getTelefoneFixo() {
		return telefoneFixo;
	}


	public void setTelefoneFixo(String telefoneFixo) {
		this.telefoneFixo = telefoneFixo;
	}


	public String getTelefoneMovel() {
		return telefoneMovel;
	}


	public void setTelefoneMovel(String telefoneMovel) {
		this.telefoneMovel = telefoneMovel;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public String getRg() {
		return rg;
	}


	public void setRg(String rg) {
		this.rg = rg;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getCref() {
		return cref;
	}


	public void setCref(String cref) {
		this.cref = cref;
	}


	public Enum getSexo() {
		return sexo;
	}


	public void setSexo(Enum sexo) {
		this.sexo = sexo;
	}


	public String getFoto() {
		return foto;
	}


	public void setFoto(String foto) {
		this.foto = foto;
	}


	public List<Equipe> getEquipes() {
		return equipes;
	}


	public List<Inscrito> getInscricoes() {
		return inscricoes;
	}


	public List<Campeonato> getCampeonatos() {
		return campeonatos;
	}
	
	
	
	
	

}
