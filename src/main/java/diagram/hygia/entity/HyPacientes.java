package diagram.hygia.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela HY_PACIENTES
 * @generated
 */
@Entity
@Table(name = "\"HY_PACIENTES\"", schema="\"HYGIAWEB\"" )
@XmlRootElement
@CronappSecurity
@JsonFilter("diagram.hygia.entity.HyPacientes")
public class HyPacientes implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "numpac", nullable = false, length=10, insertable=true, updatable=true)
  private java.lang.Long numpac;

  /**
  * @generated
  */
  @Column(name = "ACEITA_SMS", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String aceitaSms;

  /**
  * @generated
  */
  @Column(name = "ACOMP_OBITO", nullable = true, unique = false, length=70, insertable=true, updatable=true)
  
  private java.lang.String acompObito;

  /**
  * @generated
  */
  @Column(name = "alergias", nullable = true, unique = false, length=70, insertable=true, updatable=true)
  
  private java.lang.String alergias;

  /**
  * @generated
  */
  @Column(name = "anexador", nullable = true, unique = false, length=10, insertable=true, updatable=true)
  
  private java.lang.Long anexador;

  /**
  * @generated
  */
  @Column(name = "apelido", nullable = true, unique = false, length=50, insertable=true, updatable=true)
  
  private java.lang.String apelido;

  /**
  * @generated
  */
  @Column(name = "ATESTADO_OBITO", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String atestadoObito;

  /**
  * @generated
  */
  @Column(name = "bairro", nullable = true, unique = false, length=50, insertable=true, updatable=true)
  
  private java.lang.String bairro;

  /**
  * @generated
  */
  @Column(name = "BO_OBITO", nullable = true, unique = false, length=1000, insertable=true, updatable=true)
  
  private java.lang.String boObito;

  /**
  * @generated
  */
  @Column(name = "BT_CEP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String btCep;

  /**
  * @generated
  */
  @Column(name = "BT_US_REF", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String btUsRef;

  /**
  * @generated
  */
  @Column(name = "CAD_URG", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String cadUrg;

  /**
  * @generated
  */
  @Column(name = "cadsusret", nullable = true, unique = false, length=2, insertable=true, updatable=true)
  
  private java.lang.Integer cadsusret;

  /**
  * @generated
  */
  @Column(name = "cartoriociv", nullable = true, unique = false, length=20, insertable=true, updatable=true)
  
  private java.lang.String cartoriociv;

  /**
  * @generated
  */
  @Column(name = "cep", nullable = true, unique = false, length=8, insertable=true, updatable=true)
  
  private java.lang.String cep;

  /**
  * @generated
  */
  @Column(name = "cidadenasc", nullable = true, unique = false, length=50, insertable=true, updatable=true)
  
  private java.lang.String cidadenasc;

  /**
  * @generated
  */
  @Column(name = "CIDADENASC_CODIGO", nullable = true, unique = false, length=10, insertable=true, updatable=true)
  
  private java.lang.String cidadenascCodigo;

  /**
  * @generated
  */
  @Column(name = "cnaer", nullable = true, unique = false, length=3, insertable=true, updatable=true)
  
  private java.lang.String cnaer;

  /**
  * @generated
  */
  @Column(name = "cns", nullable = true, unique = false, length=15, insertable=true, updatable=true)
  
  private java.lang.Long cns;

  /**
  * @generated
  */
  @Column(name = "complend", nullable = true, unique = false, length=50, insertable=true, updatable=true)
  
  private java.lang.String complend;

  /**
  * @generated
  */
  @Column(name = "CPF_RESP", nullable = true, unique = false, length=11, insertable=true, updatable=true)
  
  private java.lang.Long cpfResp;

  /**
  * @generated
  */
  @Column(name = "ctps", nullable = true, unique = false, length=8, insertable=true, updatable=true)
  
  private java.lang.Integer ctps;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "ctpsdata", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.util.Date ctpsdata;

  /**
  * @generated
  */
  @Column(name = "ctpsserie", nullable = true, unique = false, length=5, insertable=true, updatable=true)
  
  private java.lang.Integer ctpsserie;

  /**
  * @generated
  */
  @Column(name = "ctpsuf", nullable = true, unique = false, length=2, insertable=true, updatable=true)
  
  private java.lang.String ctpsuf;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "dataatualiz", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.util.Date dataatualiz;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "datacad", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.util.Date datacad;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "dataemisciv", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.util.Date dataemisciv;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "dataemisid", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.util.Date dataemisid;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "dataentrest", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.util.Date dataentrest;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "datanasc", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.util.Date datanasc;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "datanatura", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.util.Date datanatura;

  /**
  * @generated
  */
  @Column(name = "declnascvivos", nullable = true, unique = false, length=11, insertable=true, updatable=true)
  
  private java.lang.Long declnascvivos;

  /**
  * @generated
  */
  @Column(name = "DESTINO_OBITO", nullable = true, unique = false, length=30, insertable=true, updatable=true)
  
  private java.lang.String destinoObito;

  /**
  * @generated
  */
  @Column(name = "DIF_ID_GENERO", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String difIdGenero;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "DT_OBITO", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.util.Date dtObito;

  /**
  * @generated
  */
  @Column(name = "email", nullable = true, unique = false, length=100, insertable=true, updatable=true)
  
  private java.lang.String email;

  /**
  * @generated
  */
  @Column(name = "EQUIPE_PSF", nullable = true, unique = false, length=18, insertable=true, updatable=true)
  
  private java.lang.Long equipePsf;

  /**
  * @generated
  */
  @Column(name = "escolaridade", nullable = true, unique = false, length=2, insertable=true, updatable=true)
  
  private java.lang.Integer escolaridade;

  /**
  * @generated
  */
  @Column(name = "estcivil", nullable = true, unique = false, length=100, insertable=true, updatable=true)
  
  private java.lang.String estcivil;

  /**
  * @generated
  */
  @Column(name = "etnia", nullable = true, unique = false, length=10, insertable=true, updatable=true)
  
  private java.lang.Long etnia;

  /**
  * @generated
  */
  @Column(name = "familia", nullable = true, unique = false, length=18, insertable=true, updatable=true)
  
  private java.lang.Long familia;

  /**
  * @generated
  */
  @Column(name = "filarecep", nullable = true, unique = false, length=18, insertable=true, updatable=true)
  
  private java.lang.Long filarecep;

  /**
  * @generated
  */
  @Column(name = "folhaciv", nullable = true, unique = false, length=4, insertable=true, updatable=true)
  
  private java.lang.String folhaciv;

  /**
  * @generated
  */
  @Column(name = "fone", nullable = true, unique = false, length=15, insertable=true, updatable=true)
  
  private java.lang.String fone;

  /**
  * @generated
  */
  @Column(name = "FONE_DDD", nullable = true, unique = false, length=3, insertable=true, updatable=true)
  
  private java.lang.Integer foneDdd;

  /**
  * @generated
  */
  @Column(name = "freqescola", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String freqescola;

  /**
  * @generated
  */
  @Column(name = "gerarpessoa", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String gerarpessoa;

  /**
  * @generated
  */
  @Column(name = "HORA_OBT", nullable = true, unique = false, length=4, insertable=true, updatable=true)
  
  private java.lang.Integer horaObt;

  /**
  * @generated
  */
  @Column(name = "HORASAIDA_OBT", nullable = true, unique = false, length=4, insertable=true, updatable=true)
  
  private java.lang.Integer horasaidaObt;

  /**
  * @generated
  */
  @Column(name = "IDADE_EST", nullable = true, unique = false, length=10, insertable=true, updatable=true)
  
  private java.lang.String idadeEst;

  /**
  * @generated
  */
  @Column(name = "INSCR_IMOB", nullable = true, unique = false, length=40, insertable=true, updatable=true)
  
  private java.lang.String inscrImob;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "JUNTA_DATA", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.util.Date juntaData;

  /**
  * @generated
  */
  @Column(name = "JUNTA_US", nullable = true, unique = false, length=10, insertable=true, updatable=true)
  
  private java.lang.String juntaUs;

  /**
  * @generated
  */
  @Column(name = "JUNTA_USUARIO", nullable = true, unique = false, length=15, insertable=true, updatable=true)
  
  private java.lang.String juntaUsuario;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "lastupdate", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.util.Date lastupdate;

  /**
  * @generated
  */
  @Column(name = "livrociv", nullable = true, unique = false, length=8, insertable=true, updatable=true)
  
  private java.lang.String livrociv;

  /**
  * @generated
  */
  @Column(name = "LOGR_CODIGO", nullable = true, unique = false, length=10, insertable=true, updatable=true)
  
  private java.lang.String logrCodigo;

  /**
  * @generated
  */
  @Column(name = "logradouro", nullable = true, unique = false, length=100, insertable=true, updatable=true)
  
  private java.lang.String logradouro;

  /**
  * @generated
  */
  @Column(name = "mae", nullable = true, unique = false, length=70, insertable=true, updatable=true)
  
  private java.lang.String mae;

  /**
  * @generated
  */
  @Column(name = "MAE_NORMAL", nullable = true, unique = false, length=70, insertable=true, updatable=true)
  
  private java.lang.String maeNormal;

  /**
  * @generated
  */
  @Column(name = "matriculareg", nullable = true, unique = false, length=32, insertable=true, updatable=true)
  
  private java.lang.String matriculareg;

  /**
  * @generated
  */
  @Column(name = "MBAIRRO_CODIGO", nullable = true, unique = false, length=10, insertable=true, updatable=true)
  
  private java.lang.String mbairroCodigo;

  /**
  * @generated
  */
  @Column(name = "MORADOR_RUA", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String moradorRua;

  /**
  * @generated
  */
  @Column(name = "MOTIVO_STATUS", nullable = true, unique = false, length=50, insertable=true, updatable=true)
  
  private java.lang.String motivoStatus;

  /**
  * @generated
  */
  @Column(name = "MUNICIPIO_CODIGO", nullable = true, unique = false, length=10, insertable=true, updatable=true)
  
  private java.lang.String municipioCodigo;

  /**
  * @generated
  */
  @Column(name = "nome", nullable = true, unique = false, length=70, insertable=true, updatable=true)
  
  private java.lang.String nome;

  /**
  * @generated
  */
  @Column(name = "NOME_FONETICO", nullable = true, unique = false, length=100, insertable=true, updatable=true)
  
  private java.lang.String nomeFonetico;

  /**
  * @generated
  */
  @Column(name = "NOME_NORMAL", nullable = true, unique = false, length=70, insertable=true, updatable=true)
  
  private java.lang.String nomeNormal;

  /**
  * @generated
  */
  @Column(name = "NOME_SOCIAL", nullable = true, unique = false, length=70, insertable=true, updatable=true)
  
  private java.lang.String nomeSocial;

  /**
  * @generated
  */
  @Column(name = "NRO_OBT", nullable = true, unique = false, length=18, insertable=true, updatable=true)
  
  private java.lang.Long nroObt;

  /**
  * @generated
  */
  @Column(name = "numcpf", nullable = true, unique = false, length=11, insertable=true, updatable=true)
  
  private java.lang.Long numcpf;

  /**
  * @generated
  */
  @Column(name = "numdoc", nullable = true, unique = false, length=24, insertable=true, updatable=true)
  
  private java.lang.String numdoc;

  /**
  * @generated
  */
  @Column(name = "numeroend", nullable = true, unique = false, length=5, insertable=true, updatable=true)
  
  private java.lang.String numeroend;

  /**
  * @generated
  */
  @Column(name = "NUMPAC_INTEGRACAO", nullable = true, unique = false, length=15, insertable=true, updatable=true)
  
  private java.lang.String numpacIntegracao;

  /**
  * @generated
  */
  @Column(name = "numtiteleitor", nullable = true, unique = false, length=12, insertable=true, updatable=true)
  
  private java.lang.Long numtiteleitor;

  /**
  * @generated
  */
  @Column(name = "observacao", nullable = true, unique = false, length=200, insertable=true, updatable=true)
  
  private java.lang.String observacao;

  /**
  * @generated
  */
  @Column(name = "OCUPACAO_CODIGO", nullable = true, unique = false, length=10, insertable=true, updatable=true)
  
  private java.lang.String ocupacaoCodigo;

  /**
  * @generated
  */
  @Column(name = "orgemisid", nullable = true, unique = false, length=2, insertable=true, updatable=true)
  
  private java.lang.Integer orgemisid;

  /**
  * @generated
  */
  @Column(name = "origem", nullable = true, unique = false, length=3, insertable=true, updatable=true)
  
  private java.lang.String origem;

  /**
  * @generated
  */
  @Column(name = "pai", nullable = true, unique = false, length=70, insertable=true, updatable=true)
  
  private java.lang.String pai;

  /**
  * @generated
  */
  @Column(name = "PAIS_CODIGO", nullable = true, unique = false, length=10, insertable=true, updatable=true)
  
  private java.lang.String paisCodigo;

  /**
  * @generated
  */
  @Column(name = "pessoa", nullable = true, unique = false, length=18, insertable=true, updatable=true)
  
  private java.lang.Long pessoa;

  /**
  * @generated
  */
  @Column(name = "pis", nullable = true, unique = false, length=11, insertable=true, updatable=true)
  
  private java.lang.Long pis;

  /**
  * @generated
  */
  @Column(name = "PORTARIA_NAT", nullable = true, unique = false, length=16, insertable=true, updatable=true)
  
  private java.lang.String portariaNat;

  /**
  * @generated
  */
  @Column(name = "POSSUI_CERTNASC", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String possuiCertnasc;

  /**
  * @generated
  */
  @Column(name = "possuicartao", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String possuicartao;

  /**
  * @generated
  */
  @Column(name = "PROFIS_OBT", nullable = true, unique = false, length=11, insertable=true, updatable=true)
  
  private java.lang.String profisObt;

  /**
  * @generated
  */
  @Column(name = "RACA_CODIGO", nullable = true, unique = false, length=15, insertable=true, updatable=true)
  
  private java.lang.String racaCodigo;

  /**
  * @generated
  */
  @Column(name = "REFER_END", nullable = true, unique = false, length=50, insertable=true, updatable=true)
  
  private java.lang.String referEnd;

  /**
  * @generated
  */
  @Column(name = "REG_OBITO", nullable = true, unique = false, length=300, insertable=true, updatable=true)
  
  private java.lang.String regObito;

  /**
  * @generated
  */
  @Column(name = "religiao", nullable = true, unique = false, length=2, insertable=true, updatable=true)
  
  private java.lang.String religiao;

  /**
  * @generated
  */
  @Column(name = "secaotiteleitor", nullable = true, unique = false, length=4, insertable=true, updatable=true)
  
  private java.lang.Integer secaotiteleitor;

  /**
  * @generated
  */
  @Column(name = "sexo", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String sexo;

  /**
  * @generated
  */
  @Column(name = "sigilo", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String sigilo;

  /**
  * @generated
  */
  @Column(name = "sitmercado", nullable = true, unique = false, length=100, insertable=true, updatable=true)
  
  private java.lang.String sitmercado;

  /**
  * @generated
  */
  @Column(name = "situacaofam", nullable = true, unique = false, length=2, insertable=true, updatable=true)
  
  private java.lang.Integer situacaofam;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "STAMP_OBITO", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.util.Date stampObito;

  /**
  * @generated
  */
  @Column(name = "status", nullable = true, unique = false, length=8, insertable=true, updatable=true)
  
  private java.lang.String status;

  /**
  * @generated
  */
  @Column(name = "termociv", nullable = true, unique = false, length=8, insertable=true, updatable=true)
  
  private java.lang.String termociv;

  /**
  * @generated
  */
  @Column(name = "tipocertciv", nullable = true, unique = false, length=10, insertable=true, updatable=true)
  
  private java.lang.String tipocertciv;

  /**
  * @generated
  */
  @Column(name = "tipodoc", nullable = true, unique = false, length=100, insertable=true, updatable=true)
  
  private java.lang.String tipodoc;

  /**
  * @generated
  */
  @Column(name = "tipologend", nullable = true, unique = false, length=5, insertable=true, updatable=true)
  
  private java.lang.String tipologend;

  /**
  * @generated
  */
  @Column(name = "trabalhando", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String trabalhando;

  /**
  * @generated
  */
  @Column(name = "ufdoc", nullable = true, unique = false, length=2, insertable=true, updatable=true)
  
  private java.lang.String ufdoc;

  /**
  * @generated
  */
  @Column(name = "ufender", nullable = true, unique = false, length=2, insertable=true, updatable=true)
  
  private java.lang.String ufender;

  /**
  * @generated
  */
  @Column(name = "ufnasc", nullable = true, unique = false, length=2, insertable=true, updatable=true)
  
  private java.lang.String ufnasc;

  /**
  * @generated
  */
  @Column(name = "US_ATZ", nullable = true, unique = false, length=10, insertable=true, updatable=true)
  
  private java.lang.String usAtz;

  /**
  * @generated
  */
  @Column(name = "US_CAD", nullable = true, unique = false, length=10, insertable=true, updatable=true)
  
  private java.lang.String usCad;

  /**
  * @generated
  */
  @Column(name = "US_CODUNIDSAU", nullable = true, unique = false, length=10, insertable=true, updatable=true)
  
  private java.lang.String usCodunidsau;

  /**
  * @generated
  */
  @Column(name = "US_ENDERECO", nullable = true, unique = false, length=10, insertable=true, updatable=true)
  
  private java.lang.String usEndereco;

  /**
  * @generated
  */
  @Column(name = "US_VACINA", nullable = true, unique = false, length=10, insertable=true, updatable=true)
  
  private java.lang.String usVacina;

  /**
  * @generated
  */
  @Column(name = "userid", nullable = true, unique = false, length=15, insertable=true, updatable=true)
  
  private java.lang.String userid;

  /**
  * @generated
  */
  @Column(name = "USU_ATUALIZ", nullable = true, unique = false, length=15, insertable=true, updatable=true)
  
  private java.lang.String usuAtualiz;

  /**
  * @generated
  */
  @Column(name = "zonatiteleitor", nullable = true, unique = false, length=3, insertable=true, updatable=true)
  
  private java.lang.Integer zonatiteleitor;

  /**
   * Construtor
   * @generated
   */
  public HyPacientes(){
  }


  /**
   * Obtém aceitaSms
   * return aceitaSms
   * @generated
   */
  
  public java.lang.String getAceitaSms(){
    return this.aceitaSms;
  }

  /**
   * Define aceitaSms
   * @param aceitaSms aceitaSms
   * @generated
   */
  public HyPacientes setAceitaSms(java.lang.String aceitaSms){
    this.aceitaSms = aceitaSms;
    return this;
  }

  /**
   * Obtém acompObito
   * return acompObito
   * @generated
   */
  
  public java.lang.String getAcompObito(){
    return this.acompObito;
  }

  /**
   * Define acompObito
   * @param acompObito acompObito
   * @generated
   */
  public HyPacientes setAcompObito(java.lang.String acompObito){
    this.acompObito = acompObito;
    return this;
  }

  /**
   * Obtém alergias
   * return alergias
   * @generated
   */
  
  public java.lang.String getAlergias(){
    return this.alergias;
  }

  /**
   * Define alergias
   * @param alergias alergias
   * @generated
   */
  public HyPacientes setAlergias(java.lang.String alergias){
    this.alergias = alergias;
    return this;
  }

  /**
   * Obtém anexador
   * return anexador
   * @generated
   */
  
  public java.lang.Long getAnexador(){
    return this.anexador;
  }

  /**
   * Define anexador
   * @param anexador anexador
   * @generated
   */
  public HyPacientes setAnexador(java.lang.Long anexador){
    this.anexador = anexador;
    return this;
  }

  /**
   * Obtém apelido
   * return apelido
   * @generated
   */
  
  public java.lang.String getApelido(){
    return this.apelido;
  }

  /**
   * Define apelido
   * @param apelido apelido
   * @generated
   */
  public HyPacientes setApelido(java.lang.String apelido){
    this.apelido = apelido;
    return this;
  }

  /**
   * Obtém atestadoObito
   * return atestadoObito
   * @generated
   */
  
  public java.lang.String getAtestadoObito(){
    return this.atestadoObito;
  }

  /**
   * Define atestadoObito
   * @param atestadoObito atestadoObito
   * @generated
   */
  public HyPacientes setAtestadoObito(java.lang.String atestadoObito){
    this.atestadoObito = atestadoObito;
    return this;
  }

  /**
   * Obtém bairro
   * return bairro
   * @generated
   */
  
  public java.lang.String getBairro(){
    return this.bairro;
  }

  /**
   * Define bairro
   * @param bairro bairro
   * @generated
   */
  public HyPacientes setBairro(java.lang.String bairro){
    this.bairro = bairro;
    return this;
  }

  /**
   * Obtém boObito
   * return boObito
   * @generated
   */
  
  public java.lang.String getBoObito(){
    return this.boObito;
  }

  /**
   * Define boObito
   * @param boObito boObito
   * @generated
   */
  public HyPacientes setBoObito(java.lang.String boObito){
    this.boObito = boObito;
    return this;
  }

  /**
   * Obtém btCep
   * return btCep
   * @generated
   */
  
  public java.lang.String getBtCep(){
    return this.btCep;
  }

  /**
   * Define btCep
   * @param btCep btCep
   * @generated
   */
  public HyPacientes setBtCep(java.lang.String btCep){
    this.btCep = btCep;
    return this;
  }

  /**
   * Obtém btUsRef
   * return btUsRef
   * @generated
   */
  
  public java.lang.String getBtUsRef(){
    return this.btUsRef;
  }

  /**
   * Define btUsRef
   * @param btUsRef btUsRef
   * @generated
   */
  public HyPacientes setBtUsRef(java.lang.String btUsRef){
    this.btUsRef = btUsRef;
    return this;
  }

  /**
   * Obtém cadUrg
   * return cadUrg
   * @generated
   */
  
  public java.lang.String getCadUrg(){
    return this.cadUrg;
  }

  /**
   * Define cadUrg
   * @param cadUrg cadUrg
   * @generated
   */
  public HyPacientes setCadUrg(java.lang.String cadUrg){
    this.cadUrg = cadUrg;
    return this;
  }

  /**
   * Obtém cadsusret
   * return cadsusret
   * @generated
   */
  
  public java.lang.Integer getCadsusret(){
    return this.cadsusret;
  }

  /**
   * Define cadsusret
   * @param cadsusret cadsusret
   * @generated
   */
  public HyPacientes setCadsusret(java.lang.Integer cadsusret){
    this.cadsusret = cadsusret;
    return this;
  }

  /**
   * Obtém cartoriociv
   * return cartoriociv
   * @generated
   */
  
  public java.lang.String getCartoriociv(){
    return this.cartoriociv;
  }

  /**
   * Define cartoriociv
   * @param cartoriociv cartoriociv
   * @generated
   */
  public HyPacientes setCartoriociv(java.lang.String cartoriociv){
    this.cartoriociv = cartoriociv;
    return this;
  }

  /**
   * Obtém cep
   * return cep
   * @generated
   */
  
  public java.lang.String getCep(){
    return this.cep;
  }

  /**
   * Define cep
   * @param cep cep
   * @generated
   */
  public HyPacientes setCep(java.lang.String cep){
    this.cep = cep;
    return this;
  }

  /**
   * Obtém cidadenasc
   * return cidadenasc
   * @generated
   */
  
  public java.lang.String getCidadenasc(){
    return this.cidadenasc;
  }

  /**
   * Define cidadenasc
   * @param cidadenasc cidadenasc
   * @generated
   */
  public HyPacientes setCidadenasc(java.lang.String cidadenasc){
    this.cidadenasc = cidadenasc;
    return this;
  }

  /**
   * Obtém cidadenascCodigo
   * return cidadenascCodigo
   * @generated
   */
  
  public java.lang.String getCidadenascCodigo(){
    return this.cidadenascCodigo;
  }

  /**
   * Define cidadenascCodigo
   * @param cidadenascCodigo cidadenascCodigo
   * @generated
   */
  public HyPacientes setCidadenascCodigo(java.lang.String cidadenascCodigo){
    this.cidadenascCodigo = cidadenascCodigo;
    return this;
  }

  /**
   * Obtém cnaer
   * return cnaer
   * @generated
   */
  
  public java.lang.String getCnaer(){
    return this.cnaer;
  }

  /**
   * Define cnaer
   * @param cnaer cnaer
   * @generated
   */
  public HyPacientes setCnaer(java.lang.String cnaer){
    this.cnaer = cnaer;
    return this;
  }

  /**
   * Obtém cns
   * return cns
   * @generated
   */
  
  public java.lang.Long getCns(){
    return this.cns;
  }

  /**
   * Define cns
   * @param cns cns
   * @generated
   */
  public HyPacientes setCns(java.lang.Long cns){
    this.cns = cns;
    return this;
  }

  /**
   * Obtém complend
   * return complend
   * @generated
   */
  
  public java.lang.String getComplend(){
    return this.complend;
  }

  /**
   * Define complend
   * @param complend complend
   * @generated
   */
  public HyPacientes setComplend(java.lang.String complend){
    this.complend = complend;
    return this;
  }

  /**
   * Obtém cpfResp
   * return cpfResp
   * @generated
   */
  
  public java.lang.Long getCpfResp(){
    return this.cpfResp;
  }

  /**
   * Define cpfResp
   * @param cpfResp cpfResp
   * @generated
   */
  public HyPacientes setCpfResp(java.lang.Long cpfResp){
    this.cpfResp = cpfResp;
    return this;
  }

  /**
   * Obtém ctps
   * return ctps
   * @generated
   */
  
  public java.lang.Integer getCtps(){
    return this.ctps;
  }

  /**
   * Define ctps
   * @param ctps ctps
   * @generated
   */
  public HyPacientes setCtps(java.lang.Integer ctps){
    this.ctps = ctps;
    return this;
  }

  /**
   * Obtém ctpsdata
   * return ctpsdata
   * @generated
   */
  
  public java.util.Date getCtpsdata(){
    return this.ctpsdata;
  }

  /**
   * Define ctpsdata
   * @param ctpsdata ctpsdata
   * @generated
   */
  public HyPacientes setCtpsdata(java.util.Date ctpsdata){
    this.ctpsdata = ctpsdata;
    return this;
  }

  /**
   * Obtém ctpsserie
   * return ctpsserie
   * @generated
   */
  
  public java.lang.Integer getCtpsserie(){
    return this.ctpsserie;
  }

  /**
   * Define ctpsserie
   * @param ctpsserie ctpsserie
   * @generated
   */
  public HyPacientes setCtpsserie(java.lang.Integer ctpsserie){
    this.ctpsserie = ctpsserie;
    return this;
  }

  /**
   * Obtém ctpsuf
   * return ctpsuf
   * @generated
   */
  
  public java.lang.String getCtpsuf(){
    return this.ctpsuf;
  }

  /**
   * Define ctpsuf
   * @param ctpsuf ctpsuf
   * @generated
   */
  public HyPacientes setCtpsuf(java.lang.String ctpsuf){
    this.ctpsuf = ctpsuf;
    return this;
  }

  /**
   * Obtém dataatualiz
   * return dataatualiz
   * @generated
   */
  
  public java.util.Date getDataatualiz(){
    return this.dataatualiz;
  }

  /**
   * Define dataatualiz
   * @param dataatualiz dataatualiz
   * @generated
   */
  public HyPacientes setDataatualiz(java.util.Date dataatualiz){
    this.dataatualiz = dataatualiz;
    return this;
  }

  /**
   * Obtém datacad
   * return datacad
   * @generated
   */
  
  public java.util.Date getDatacad(){
    return this.datacad;
  }

  /**
   * Define datacad
   * @param datacad datacad
   * @generated
   */
  public HyPacientes setDatacad(java.util.Date datacad){
    this.datacad = datacad;
    return this;
  }

  /**
   * Obtém dataemisciv
   * return dataemisciv
   * @generated
   */
  
  public java.util.Date getDataemisciv(){
    return this.dataemisciv;
  }

  /**
   * Define dataemisciv
   * @param dataemisciv dataemisciv
   * @generated
   */
  public HyPacientes setDataemisciv(java.util.Date dataemisciv){
    this.dataemisciv = dataemisciv;
    return this;
  }

  /**
   * Obtém dataemisid
   * return dataemisid
   * @generated
   */
  
  public java.util.Date getDataemisid(){
    return this.dataemisid;
  }

  /**
   * Define dataemisid
   * @param dataemisid dataemisid
   * @generated
   */
  public HyPacientes setDataemisid(java.util.Date dataemisid){
    this.dataemisid = dataemisid;
    return this;
  }

  /**
   * Obtém dataentrest
   * return dataentrest
   * @generated
   */
  
  public java.util.Date getDataentrest(){
    return this.dataentrest;
  }

  /**
   * Define dataentrest
   * @param dataentrest dataentrest
   * @generated
   */
  public HyPacientes setDataentrest(java.util.Date dataentrest){
    this.dataentrest = dataentrest;
    return this;
  }

  /**
   * Obtém datanasc
   * return datanasc
   * @generated
   */
  
  public java.util.Date getDatanasc(){
    return this.datanasc;
  }

  /**
   * Define datanasc
   * @param datanasc datanasc
   * @generated
   */
  public HyPacientes setDatanasc(java.util.Date datanasc){
    this.datanasc = datanasc;
    return this;
  }

  /**
   * Obtém datanatura
   * return datanatura
   * @generated
   */
  
  public java.util.Date getDatanatura(){
    return this.datanatura;
  }

  /**
   * Define datanatura
   * @param datanatura datanatura
   * @generated
   */
  public HyPacientes setDatanatura(java.util.Date datanatura){
    this.datanatura = datanatura;
    return this;
  }

  /**
   * Obtém declnascvivos
   * return declnascvivos
   * @generated
   */
  
  public java.lang.Long getDeclnascvivos(){
    return this.declnascvivos;
  }

  /**
   * Define declnascvivos
   * @param declnascvivos declnascvivos
   * @generated
   */
  public HyPacientes setDeclnascvivos(java.lang.Long declnascvivos){
    this.declnascvivos = declnascvivos;
    return this;
  }

  /**
   * Obtém destinoObito
   * return destinoObito
   * @generated
   */
  
  public java.lang.String getDestinoObito(){
    return this.destinoObito;
  }

  /**
   * Define destinoObito
   * @param destinoObito destinoObito
   * @generated
   */
  public HyPacientes setDestinoObito(java.lang.String destinoObito){
    this.destinoObito = destinoObito;
    return this;
  }

  /**
   * Obtém difIdGenero
   * return difIdGenero
   * @generated
   */
  
  public java.lang.String getDifIdGenero(){
    return this.difIdGenero;
  }

  /**
   * Define difIdGenero
   * @param difIdGenero difIdGenero
   * @generated
   */
  public HyPacientes setDifIdGenero(java.lang.String difIdGenero){
    this.difIdGenero = difIdGenero;
    return this;
  }

  /**
   * Obtém dtObito
   * return dtObito
   * @generated
   */
  
  public java.util.Date getDtObito(){
    return this.dtObito;
  }

  /**
   * Define dtObito
   * @param dtObito dtObito
   * @generated
   */
  public HyPacientes setDtObito(java.util.Date dtObito){
    this.dtObito = dtObito;
    return this;
  }

  /**
   * Obtém email
   * return email
   * @generated
   */
  
  public java.lang.String getEmail(){
    return this.email;
  }

  /**
   * Define email
   * @param email email
   * @generated
   */
  public HyPacientes setEmail(java.lang.String email){
    this.email = email;
    return this;
  }

  /**
   * Obtém equipePsf
   * return equipePsf
   * @generated
   */
  
  public java.lang.Long getEquipePsf(){
    return this.equipePsf;
  }

  /**
   * Define equipePsf
   * @param equipePsf equipePsf
   * @generated
   */
  public HyPacientes setEquipePsf(java.lang.Long equipePsf){
    this.equipePsf = equipePsf;
    return this;
  }

  /**
   * Obtém escolaridade
   * return escolaridade
   * @generated
   */
  
  public java.lang.Integer getEscolaridade(){
    return this.escolaridade;
  }

  /**
   * Define escolaridade
   * @param escolaridade escolaridade
   * @generated
   */
  public HyPacientes setEscolaridade(java.lang.Integer escolaridade){
    this.escolaridade = escolaridade;
    return this;
  }

  /**
   * Obtém estcivil
   * return estcivil
   * @generated
   */
  
  public java.lang.String getEstcivil(){
    return this.estcivil;
  }

  /**
   * Define estcivil
   * @param estcivil estcivil
   * @generated
   */
  public HyPacientes setEstcivil(java.lang.String estcivil){
    this.estcivil = estcivil;
    return this;
  }

  /**
   * Obtém etnia
   * return etnia
   * @generated
   */
  
  public java.lang.Long getEtnia(){
    return this.etnia;
  }

  /**
   * Define etnia
   * @param etnia etnia
   * @generated
   */
  public HyPacientes setEtnia(java.lang.Long etnia){
    this.etnia = etnia;
    return this;
  }

  /**
   * Obtém familia
   * return familia
   * @generated
   */
  
  public java.lang.Long getFamilia(){
    return this.familia;
  }

  /**
   * Define familia
   * @param familia familia
   * @generated
   */
  public HyPacientes setFamilia(java.lang.Long familia){
    this.familia = familia;
    return this;
  }

  /**
   * Obtém filarecep
   * return filarecep
   * @generated
   */
  
  public java.lang.Long getFilarecep(){
    return this.filarecep;
  }

  /**
   * Define filarecep
   * @param filarecep filarecep
   * @generated
   */
  public HyPacientes setFilarecep(java.lang.Long filarecep){
    this.filarecep = filarecep;
    return this;
  }

  /**
   * Obtém folhaciv
   * return folhaciv
   * @generated
   */
  
  public java.lang.String getFolhaciv(){
    return this.folhaciv;
  }

  /**
   * Define folhaciv
   * @param folhaciv folhaciv
   * @generated
   */
  public HyPacientes setFolhaciv(java.lang.String folhaciv){
    this.folhaciv = folhaciv;
    return this;
  }

  /**
   * Obtém fone
   * return fone
   * @generated
   */
  
  public java.lang.String getFone(){
    return this.fone;
  }

  /**
   * Define fone
   * @param fone fone
   * @generated
   */
  public HyPacientes setFone(java.lang.String fone){
    this.fone = fone;
    return this;
  }

  /**
   * Obtém foneDdd
   * return foneDdd
   * @generated
   */
  
  public java.lang.Integer getFoneDdd(){
    return this.foneDdd;
  }

  /**
   * Define foneDdd
   * @param foneDdd foneDdd
   * @generated
   */
  public HyPacientes setFoneDdd(java.lang.Integer foneDdd){
    this.foneDdd = foneDdd;
    return this;
  }

  /**
   * Obtém freqescola
   * return freqescola
   * @generated
   */
  
  public java.lang.String getFreqescola(){
    return this.freqescola;
  }

  /**
   * Define freqescola
   * @param freqescola freqescola
   * @generated
   */
  public HyPacientes setFreqescola(java.lang.String freqescola){
    this.freqescola = freqescola;
    return this;
  }

  /**
   * Obtém gerarpessoa
   * return gerarpessoa
   * @generated
   */
  
  public java.lang.String getGerarpessoa(){
    return this.gerarpessoa;
  }

  /**
   * Define gerarpessoa
   * @param gerarpessoa gerarpessoa
   * @generated
   */
  public HyPacientes setGerarpessoa(java.lang.String gerarpessoa){
    this.gerarpessoa = gerarpessoa;
    return this;
  }

  /**
   * Obtém horaObt
   * return horaObt
   * @generated
   */
  
  public java.lang.Integer getHoraObt(){
    return this.horaObt;
  }

  /**
   * Define horaObt
   * @param horaObt horaObt
   * @generated
   */
  public HyPacientes setHoraObt(java.lang.Integer horaObt){
    this.horaObt = horaObt;
    return this;
  }

  /**
   * Obtém horasaidaObt
   * return horasaidaObt
   * @generated
   */
  
  public java.lang.Integer getHorasaidaObt(){
    return this.horasaidaObt;
  }

  /**
   * Define horasaidaObt
   * @param horasaidaObt horasaidaObt
   * @generated
   */
  public HyPacientes setHorasaidaObt(java.lang.Integer horasaidaObt){
    this.horasaidaObt = horasaidaObt;
    return this;
  }

  /**
   * Obtém idadeEst
   * return idadeEst
   * @generated
   */
  
  public java.lang.String getIdadeEst(){
    return this.idadeEst;
  }

  /**
   * Define idadeEst
   * @param idadeEst idadeEst
   * @generated
   */
  public HyPacientes setIdadeEst(java.lang.String idadeEst){
    this.idadeEst = idadeEst;
    return this;
  }

  /**
   * Obtém inscrImob
   * return inscrImob
   * @generated
   */
  
  public java.lang.String getInscrImob(){
    return this.inscrImob;
  }

  /**
   * Define inscrImob
   * @param inscrImob inscrImob
   * @generated
   */
  public HyPacientes setInscrImob(java.lang.String inscrImob){
    this.inscrImob = inscrImob;
    return this;
  }

  /**
   * Obtém juntaData
   * return juntaData
   * @generated
   */
  
  public java.util.Date getJuntaData(){
    return this.juntaData;
  }

  /**
   * Define juntaData
   * @param juntaData juntaData
   * @generated
   */
  public HyPacientes setJuntaData(java.util.Date juntaData){
    this.juntaData = juntaData;
    return this;
  }

  /**
   * Obtém juntaUs
   * return juntaUs
   * @generated
   */
  
  public java.lang.String getJuntaUs(){
    return this.juntaUs;
  }

  /**
   * Define juntaUs
   * @param juntaUs juntaUs
   * @generated
   */
  public HyPacientes setJuntaUs(java.lang.String juntaUs){
    this.juntaUs = juntaUs;
    return this;
  }

  /**
   * Obtém juntaUsuario
   * return juntaUsuario
   * @generated
   */
  
  public java.lang.String getJuntaUsuario(){
    return this.juntaUsuario;
  }

  /**
   * Define juntaUsuario
   * @param juntaUsuario juntaUsuario
   * @generated
   */
  public HyPacientes setJuntaUsuario(java.lang.String juntaUsuario){
    this.juntaUsuario = juntaUsuario;
    return this;
  }

  /**
   * Obtém lastupdate
   * return lastupdate
   * @generated
   */
  
  public java.util.Date getLastupdate(){
    return this.lastupdate;
  }

  /**
   * Define lastupdate
   * @param lastupdate lastupdate
   * @generated
   */
  public HyPacientes setLastupdate(java.util.Date lastupdate){
    this.lastupdate = lastupdate;
    return this;
  }

  /**
   * Obtém livrociv
   * return livrociv
   * @generated
   */
  
  public java.lang.String getLivrociv(){
    return this.livrociv;
  }

  /**
   * Define livrociv
   * @param livrociv livrociv
   * @generated
   */
  public HyPacientes setLivrociv(java.lang.String livrociv){
    this.livrociv = livrociv;
    return this;
  }

  /**
   * Obtém logrCodigo
   * return logrCodigo
   * @generated
   */
  
  public java.lang.String getLogrCodigo(){
    return this.logrCodigo;
  }

  /**
   * Define logrCodigo
   * @param logrCodigo logrCodigo
   * @generated
   */
  public HyPacientes setLogrCodigo(java.lang.String logrCodigo){
    this.logrCodigo = logrCodigo;
    return this;
  }

  /**
   * Obtém logradouro
   * return logradouro
   * @generated
   */
  
  public java.lang.String getLogradouro(){
    return this.logradouro;
  }

  /**
   * Define logradouro
   * @param logradouro logradouro
   * @generated
   */
  public HyPacientes setLogradouro(java.lang.String logradouro){
    this.logradouro = logradouro;
    return this;
  }

  /**
   * Obtém mae
   * return mae
   * @generated
   */
  
  public java.lang.String getMae(){
    return this.mae;
  }

  /**
   * Define mae
   * @param mae mae
   * @generated
   */
  public HyPacientes setMae(java.lang.String mae){
    this.mae = mae;
    return this;
  }

  /**
   * Obtém maeNormal
   * return maeNormal
   * @generated
   */
  
  public java.lang.String getMaeNormal(){
    return this.maeNormal;
  }

  /**
   * Define maeNormal
   * @param maeNormal maeNormal
   * @generated
   */
  public HyPacientes setMaeNormal(java.lang.String maeNormal){
    this.maeNormal = maeNormal;
    return this;
  }

  /**
   * Obtém matriculareg
   * return matriculareg
   * @generated
   */
  
  public java.lang.String getMatriculareg(){
    return this.matriculareg;
  }

  /**
   * Define matriculareg
   * @param matriculareg matriculareg
   * @generated
   */
  public HyPacientes setMatriculareg(java.lang.String matriculareg){
    this.matriculareg = matriculareg;
    return this;
  }

  /**
   * Obtém mbairroCodigo
   * return mbairroCodigo
   * @generated
   */
  
  public java.lang.String getMbairroCodigo(){
    return this.mbairroCodigo;
  }

  /**
   * Define mbairroCodigo
   * @param mbairroCodigo mbairroCodigo
   * @generated
   */
  public HyPacientes setMbairroCodigo(java.lang.String mbairroCodigo){
    this.mbairroCodigo = mbairroCodigo;
    return this;
  }

  /**
   * Obtém moradorRua
   * return moradorRua
   * @generated
   */
  
  public java.lang.String getMoradorRua(){
    return this.moradorRua;
  }

  /**
   * Define moradorRua
   * @param moradorRua moradorRua
   * @generated
   */
  public HyPacientes setMoradorRua(java.lang.String moradorRua){
    this.moradorRua = moradorRua;
    return this;
  }

  /**
   * Obtém motivoStatus
   * return motivoStatus
   * @generated
   */
  
  public java.lang.String getMotivoStatus(){
    return this.motivoStatus;
  }

  /**
   * Define motivoStatus
   * @param motivoStatus motivoStatus
   * @generated
   */
  public HyPacientes setMotivoStatus(java.lang.String motivoStatus){
    this.motivoStatus = motivoStatus;
    return this;
  }

  /**
   * Obtém municipioCodigo
   * return municipioCodigo
   * @generated
   */
  
  public java.lang.String getMunicipioCodigo(){
    return this.municipioCodigo;
  }

  /**
   * Define municipioCodigo
   * @param municipioCodigo municipioCodigo
   * @generated
   */
  public HyPacientes setMunicipioCodigo(java.lang.String municipioCodigo){
    this.municipioCodigo = municipioCodigo;
    return this;
  }

  /**
   * Obtém nome
   * return nome
   * @generated
   */
  
  public java.lang.String getNome(){
    return this.nome;
  }

  /**
   * Define nome
   * @param nome nome
   * @generated
   */
  public HyPacientes setNome(java.lang.String nome){
    this.nome = nome;
    return this;
  }

  /**
   * Obtém nomeFonetico
   * return nomeFonetico
   * @generated
   */
  
  public java.lang.String getNomeFonetico(){
    return this.nomeFonetico;
  }

  /**
   * Define nomeFonetico
   * @param nomeFonetico nomeFonetico
   * @generated
   */
  public HyPacientes setNomeFonetico(java.lang.String nomeFonetico){
    this.nomeFonetico = nomeFonetico;
    return this;
  }

  /**
   * Obtém nomeNormal
   * return nomeNormal
   * @generated
   */
  
  public java.lang.String getNomeNormal(){
    return this.nomeNormal;
  }

  /**
   * Define nomeNormal
   * @param nomeNormal nomeNormal
   * @generated
   */
  public HyPacientes setNomeNormal(java.lang.String nomeNormal){
    this.nomeNormal = nomeNormal;
    return this;
  }

  /**
   * Obtém nomeSocial
   * return nomeSocial
   * @generated
   */
  
  public java.lang.String getNomeSocial(){
    return this.nomeSocial;
  }

  /**
   * Define nomeSocial
   * @param nomeSocial nomeSocial
   * @generated
   */
  public HyPacientes setNomeSocial(java.lang.String nomeSocial){
    this.nomeSocial = nomeSocial;
    return this;
  }

  /**
   * Obtém nroObt
   * return nroObt
   * @generated
   */
  
  public java.lang.Long getNroObt(){
    return this.nroObt;
  }

  /**
   * Define nroObt
   * @param nroObt nroObt
   * @generated
   */
  public HyPacientes setNroObt(java.lang.Long nroObt){
    this.nroObt = nroObt;
    return this;
  }

  /**
   * Obtém numcpf
   * return numcpf
   * @generated
   */
  
  public java.lang.Long getNumcpf(){
    return this.numcpf;
  }

  /**
   * Define numcpf
   * @param numcpf numcpf
   * @generated
   */
  public HyPacientes setNumcpf(java.lang.Long numcpf){
    this.numcpf = numcpf;
    return this;
  }

  /**
   * Obtém numdoc
   * return numdoc
   * @generated
   */
  
  public java.lang.String getNumdoc(){
    return this.numdoc;
  }

  /**
   * Define numdoc
   * @param numdoc numdoc
   * @generated
   */
  public HyPacientes setNumdoc(java.lang.String numdoc){
    this.numdoc = numdoc;
    return this;
  }

  /**
   * Obtém numeroend
   * return numeroend
   * @generated
   */
  
  public java.lang.String getNumeroend(){
    return this.numeroend;
  }

  /**
   * Define numeroend
   * @param numeroend numeroend
   * @generated
   */
  public HyPacientes setNumeroend(java.lang.String numeroend){
    this.numeroend = numeroend;
    return this;
  }

  /**
   * Obtém numpac
   * return numpac
   * @generated
   */
  
  public java.lang.Long getNumpac(){
    return this.numpac;
  }

  /**
   * Define numpac
   * @param numpac numpac
   * @generated
   */
  public HyPacientes setNumpac(java.lang.Long numpac){
    this.numpac = numpac;
    return this;
  }

  /**
   * Obtém numpacIntegracao
   * return numpacIntegracao
   * @generated
   */
  
  public java.lang.String getNumpacIntegracao(){
    return this.numpacIntegracao;
  }

  /**
   * Define numpacIntegracao
   * @param numpacIntegracao numpacIntegracao
   * @generated
   */
  public HyPacientes setNumpacIntegracao(java.lang.String numpacIntegracao){
    this.numpacIntegracao = numpacIntegracao;
    return this;
  }

  /**
   * Obtém numtiteleitor
   * return numtiteleitor
   * @generated
   */
  
  public java.lang.Long getNumtiteleitor(){
    return this.numtiteleitor;
  }

  /**
   * Define numtiteleitor
   * @param numtiteleitor numtiteleitor
   * @generated
   */
  public HyPacientes setNumtiteleitor(java.lang.Long numtiteleitor){
    this.numtiteleitor = numtiteleitor;
    return this;
  }

  /**
   * Obtém observacao
   * return observacao
   * @generated
   */
  
  public java.lang.String getObservacao(){
    return this.observacao;
  }

  /**
   * Define observacao
   * @param observacao observacao
   * @generated
   */
  public HyPacientes setObservacao(java.lang.String observacao){
    this.observacao = observacao;
    return this;
  }

  /**
   * Obtém ocupacaoCodigo
   * return ocupacaoCodigo
   * @generated
   */
  
  public java.lang.String getOcupacaoCodigo(){
    return this.ocupacaoCodigo;
  }

  /**
   * Define ocupacaoCodigo
   * @param ocupacaoCodigo ocupacaoCodigo
   * @generated
   */
  public HyPacientes setOcupacaoCodigo(java.lang.String ocupacaoCodigo){
    this.ocupacaoCodigo = ocupacaoCodigo;
    return this;
  }

  /**
   * Obtém orgemisid
   * return orgemisid
   * @generated
   */
  
  public java.lang.Integer getOrgemisid(){
    return this.orgemisid;
  }

  /**
   * Define orgemisid
   * @param orgemisid orgemisid
   * @generated
   */
  public HyPacientes setOrgemisid(java.lang.Integer orgemisid){
    this.orgemisid = orgemisid;
    return this;
  }

  /**
   * Obtém origem
   * return origem
   * @generated
   */
  
  public java.lang.String getOrigem(){
    return this.origem;
  }

  /**
   * Define origem
   * @param origem origem
   * @generated
   */
  public HyPacientes setOrigem(java.lang.String origem){
    this.origem = origem;
    return this;
  }

  /**
   * Obtém pai
   * return pai
   * @generated
   */
  
  public java.lang.String getPai(){
    return this.pai;
  }

  /**
   * Define pai
   * @param pai pai
   * @generated
   */
  public HyPacientes setPai(java.lang.String pai){
    this.pai = pai;
    return this;
  }

  /**
   * Obtém paisCodigo
   * return paisCodigo
   * @generated
   */
  
  public java.lang.String getPaisCodigo(){
    return this.paisCodigo;
  }

  /**
   * Define paisCodigo
   * @param paisCodigo paisCodigo
   * @generated
   */
  public HyPacientes setPaisCodigo(java.lang.String paisCodigo){
    this.paisCodigo = paisCodigo;
    return this;
  }

  /**
   * Obtém pessoa
   * return pessoa
   * @generated
   */
  
  public java.lang.Long getPessoa(){
    return this.pessoa;
  }

  /**
   * Define pessoa
   * @param pessoa pessoa
   * @generated
   */
  public HyPacientes setPessoa(java.lang.Long pessoa){
    this.pessoa = pessoa;
    return this;
  }

  /**
   * Obtém pis
   * return pis
   * @generated
   */
  
  public java.lang.Long getPis(){
    return this.pis;
  }

  /**
   * Define pis
   * @param pis pis
   * @generated
   */
  public HyPacientes setPis(java.lang.Long pis){
    this.pis = pis;
    return this;
  }

  /**
   * Obtém portariaNat
   * return portariaNat
   * @generated
   */
  
  public java.lang.String getPortariaNat(){
    return this.portariaNat;
  }

  /**
   * Define portariaNat
   * @param portariaNat portariaNat
   * @generated
   */
  public HyPacientes setPortariaNat(java.lang.String portariaNat){
    this.portariaNat = portariaNat;
    return this;
  }

  /**
   * Obtém possuiCertnasc
   * return possuiCertnasc
   * @generated
   */
  
  public java.lang.String getPossuiCertnasc(){
    return this.possuiCertnasc;
  }

  /**
   * Define possuiCertnasc
   * @param possuiCertnasc possuiCertnasc
   * @generated
   */
  public HyPacientes setPossuiCertnasc(java.lang.String possuiCertnasc){
    this.possuiCertnasc = possuiCertnasc;
    return this;
  }

  /**
   * Obtém possuicartao
   * return possuicartao
   * @generated
   */
  
  public java.lang.String getPossuicartao(){
    return this.possuicartao;
  }

  /**
   * Define possuicartao
   * @param possuicartao possuicartao
   * @generated
   */
  public HyPacientes setPossuicartao(java.lang.String possuicartao){
    this.possuicartao = possuicartao;
    return this;
  }

  /**
   * Obtém profisObt
   * return profisObt
   * @generated
   */
  
  public java.lang.String getProfisObt(){
    return this.profisObt;
  }

  /**
   * Define profisObt
   * @param profisObt profisObt
   * @generated
   */
  public HyPacientes setProfisObt(java.lang.String profisObt){
    this.profisObt = profisObt;
    return this;
  }

  /**
   * Obtém racaCodigo
   * return racaCodigo
   * @generated
   */
  
  public java.lang.String getRacaCodigo(){
    return this.racaCodigo;
  }

  /**
   * Define racaCodigo
   * @param racaCodigo racaCodigo
   * @generated
   */
  public HyPacientes setRacaCodigo(java.lang.String racaCodigo){
    this.racaCodigo = racaCodigo;
    return this;
  }

  /**
   * Obtém referEnd
   * return referEnd
   * @generated
   */
  
  public java.lang.String getReferEnd(){
    return this.referEnd;
  }

  /**
   * Define referEnd
   * @param referEnd referEnd
   * @generated
   */
  public HyPacientes setReferEnd(java.lang.String referEnd){
    this.referEnd = referEnd;
    return this;
  }

  /**
   * Obtém regObito
   * return regObito
   * @generated
   */
  
  public java.lang.String getRegObito(){
    return this.regObito;
  }

  /**
   * Define regObito
   * @param regObito regObito
   * @generated
   */
  public HyPacientes setRegObito(java.lang.String regObito){
    this.regObito = regObito;
    return this;
  }

  /**
   * Obtém religiao
   * return religiao
   * @generated
   */
  
  public java.lang.String getReligiao(){
    return this.religiao;
  }

  /**
   * Define religiao
   * @param religiao religiao
   * @generated
   */
  public HyPacientes setReligiao(java.lang.String religiao){
    this.religiao = religiao;
    return this;
  }

  /**
   * Obtém secaotiteleitor
   * return secaotiteleitor
   * @generated
   */
  
  public java.lang.Integer getSecaotiteleitor(){
    return this.secaotiteleitor;
  }

  /**
   * Define secaotiteleitor
   * @param secaotiteleitor secaotiteleitor
   * @generated
   */
  public HyPacientes setSecaotiteleitor(java.lang.Integer secaotiteleitor){
    this.secaotiteleitor = secaotiteleitor;
    return this;
  }

  /**
   * Obtém sexo
   * return sexo
   * @generated
   */
  
  public java.lang.String getSexo(){
    return this.sexo;
  }

  /**
   * Define sexo
   * @param sexo sexo
   * @generated
   */
  public HyPacientes setSexo(java.lang.String sexo){
    this.sexo = sexo;
    return this;
  }

  /**
   * Obtém sigilo
   * return sigilo
   * @generated
   */
  
  public java.lang.String getSigilo(){
    return this.sigilo;
  }

  /**
   * Define sigilo
   * @param sigilo sigilo
   * @generated
   */
  public HyPacientes setSigilo(java.lang.String sigilo){
    this.sigilo = sigilo;
    return this;
  }

  /**
   * Obtém sitmercado
   * return sitmercado
   * @generated
   */
  
  public java.lang.String getSitmercado(){
    return this.sitmercado;
  }

  /**
   * Define sitmercado
   * @param sitmercado sitmercado
   * @generated
   */
  public HyPacientes setSitmercado(java.lang.String sitmercado){
    this.sitmercado = sitmercado;
    return this;
  }

  /**
   * Obtém situacaofam
   * return situacaofam
   * @generated
   */
  
  public java.lang.Integer getSituacaofam(){
    return this.situacaofam;
  }

  /**
   * Define situacaofam
   * @param situacaofam situacaofam
   * @generated
   */
  public HyPacientes setSituacaofam(java.lang.Integer situacaofam){
    this.situacaofam = situacaofam;
    return this;
  }

  /**
   * Obtém stampObito
   * return stampObito
   * @generated
   */
  
  public java.util.Date getStampObito(){
    return this.stampObito;
  }

  /**
   * Define stampObito
   * @param stampObito stampObito
   * @generated
   */
  public HyPacientes setStampObito(java.util.Date stampObito){
    this.stampObito = stampObito;
    return this;
  }

  /**
   * Obtém status
   * return status
   * @generated
   */
  
  public java.lang.String getStatus(){
    return this.status;
  }

  /**
   * Define status
   * @param status status
   * @generated
   */
  public HyPacientes setStatus(java.lang.String status){
    this.status = status;
    return this;
  }

  /**
   * Obtém termociv
   * return termociv
   * @generated
   */
  
  public java.lang.String getTermociv(){
    return this.termociv;
  }

  /**
   * Define termociv
   * @param termociv termociv
   * @generated
   */
  public HyPacientes setTermociv(java.lang.String termociv){
    this.termociv = termociv;
    return this;
  }

  /**
   * Obtém tipocertciv
   * return tipocertciv
   * @generated
   */
  
  public java.lang.String getTipocertciv(){
    return this.tipocertciv;
  }

  /**
   * Define tipocertciv
   * @param tipocertciv tipocertciv
   * @generated
   */
  public HyPacientes setTipocertciv(java.lang.String tipocertciv){
    this.tipocertciv = tipocertciv;
    return this;
  }

  /**
   * Obtém tipodoc
   * return tipodoc
   * @generated
   */
  
  public java.lang.String getTipodoc(){
    return this.tipodoc;
  }

  /**
   * Define tipodoc
   * @param tipodoc tipodoc
   * @generated
   */
  public HyPacientes setTipodoc(java.lang.String tipodoc){
    this.tipodoc = tipodoc;
    return this;
  }

  /**
   * Obtém tipologend
   * return tipologend
   * @generated
   */
  
  public java.lang.String getTipologend(){
    return this.tipologend;
  }

  /**
   * Define tipologend
   * @param tipologend tipologend
   * @generated
   */
  public HyPacientes setTipologend(java.lang.String tipologend){
    this.tipologend = tipologend;
    return this;
  }

  /**
   * Obtém trabalhando
   * return trabalhando
   * @generated
   */
  
  public java.lang.String getTrabalhando(){
    return this.trabalhando;
  }

  /**
   * Define trabalhando
   * @param trabalhando trabalhando
   * @generated
   */
  public HyPacientes setTrabalhando(java.lang.String trabalhando){
    this.trabalhando = trabalhando;
    return this;
  }

  /**
   * Obtém ufdoc
   * return ufdoc
   * @generated
   */
  
  public java.lang.String getUfdoc(){
    return this.ufdoc;
  }

  /**
   * Define ufdoc
   * @param ufdoc ufdoc
   * @generated
   */
  public HyPacientes setUfdoc(java.lang.String ufdoc){
    this.ufdoc = ufdoc;
    return this;
  }

  /**
   * Obtém ufender
   * return ufender
   * @generated
   */
  
  public java.lang.String getUfender(){
    return this.ufender;
  }

  /**
   * Define ufender
   * @param ufender ufender
   * @generated
   */
  public HyPacientes setUfender(java.lang.String ufender){
    this.ufender = ufender;
    return this;
  }

  /**
   * Obtém ufnasc
   * return ufnasc
   * @generated
   */
  
  public java.lang.String getUfnasc(){
    return this.ufnasc;
  }

  /**
   * Define ufnasc
   * @param ufnasc ufnasc
   * @generated
   */
  public HyPacientes setUfnasc(java.lang.String ufnasc){
    this.ufnasc = ufnasc;
    return this;
  }

  /**
   * Obtém usAtz
   * return usAtz
   * @generated
   */
  
  public java.lang.String getUsAtz(){
    return this.usAtz;
  }

  /**
   * Define usAtz
   * @param usAtz usAtz
   * @generated
   */
  public HyPacientes setUsAtz(java.lang.String usAtz){
    this.usAtz = usAtz;
    return this;
  }

  /**
   * Obtém usCad
   * return usCad
   * @generated
   */
  
  public java.lang.String getUsCad(){
    return this.usCad;
  }

  /**
   * Define usCad
   * @param usCad usCad
   * @generated
   */
  public HyPacientes setUsCad(java.lang.String usCad){
    this.usCad = usCad;
    return this;
  }

  /**
   * Obtém usCodunidsau
   * return usCodunidsau
   * @generated
   */
  
  public java.lang.String getUsCodunidsau(){
    return this.usCodunidsau;
  }

  /**
   * Define usCodunidsau
   * @param usCodunidsau usCodunidsau
   * @generated
   */
  public HyPacientes setUsCodunidsau(java.lang.String usCodunidsau){
    this.usCodunidsau = usCodunidsau;
    return this;
  }

  /**
   * Obtém usEndereco
   * return usEndereco
   * @generated
   */
  
  public java.lang.String getUsEndereco(){
    return this.usEndereco;
  }

  /**
   * Define usEndereco
   * @param usEndereco usEndereco
   * @generated
   */
  public HyPacientes setUsEndereco(java.lang.String usEndereco){
    this.usEndereco = usEndereco;
    return this;
  }

  /**
   * Obtém usVacina
   * return usVacina
   * @generated
   */
  
  public java.lang.String getUsVacina(){
    return this.usVacina;
  }

  /**
   * Define usVacina
   * @param usVacina usVacina
   * @generated
   */
  public HyPacientes setUsVacina(java.lang.String usVacina){
    this.usVacina = usVacina;
    return this;
  }

  /**
   * Obtém userid
   * return userid
   * @generated
   */
  
  public java.lang.String getUserid(){
    return this.userid;
  }

  /**
   * Define userid
   * @param userid userid
   * @generated
   */
  public HyPacientes setUserid(java.lang.String userid){
    this.userid = userid;
    return this;
  }

  /**
   * Obtém usuAtualiz
   * return usuAtualiz
   * @generated
   */
  
  public java.lang.String getUsuAtualiz(){
    return this.usuAtualiz;
  }

  /**
   * Define usuAtualiz
   * @param usuAtualiz usuAtualiz
   * @generated
   */
  public HyPacientes setUsuAtualiz(java.lang.String usuAtualiz){
    this.usuAtualiz = usuAtualiz;
    return this;
  }

  /**
   * Obtém zonatiteleitor
   * return zonatiteleitor
   * @generated
   */
  
  public java.lang.Integer getZonatiteleitor(){
    return this.zonatiteleitor;
  }

  /**
   * Define zonatiteleitor
   * @param zonatiteleitor zonatiteleitor
   * @generated
   */
  public HyPacientes setZonatiteleitor(java.lang.Integer zonatiteleitor){
    this.zonatiteleitor = zonatiteleitor;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    HyPacientes object = (HyPacientes)obj;
    if (numpac != null ? !numpac.equals(object.numpac) : object.numpac != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((numpac == null) ? 0 : numpac.hashCode());
    return result;
  }

}
