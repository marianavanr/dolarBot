package diagram.hygia.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela HY_UNIDSAU
 * @generated
 */
@Entity
@Table(name = "\"HY_UNIDSAU\"", schema="\"HYGIAWEB\"" )
@XmlRootElement
@CronappSecurity
@JsonFilter("diagram.hygia.entity.HyUnidsau")
public class HyUnidsau implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "codunidsau", nullable = false, length=10, insertable=true, updatable=true)
  private java.lang.String codunidsau;

  /**
  * @generated
  */
  @Column(name = "abrev", nullable = true, unique = false, length=15, insertable=true, updatable=true)
  
  private java.lang.String abrev;

  /**
  * @generated
  */
  @Column(name = "altaint", nullable = true, unique = false, length=10, insertable=true, updatable=true)
  
  private java.lang.String altaint;

  /**
  * @generated
  */
  @Column(name = "ATEND_MEDIC_UPA_CUST", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String atendMedicUpaCust;

  /**
  * @generated
  */
  @Column(name = "ATEND_REG_PAGINA", nullable = true, unique = false, length=10, insertable=true, updatable=true)
  
  private java.lang.String atendRegPagina;

  /**
  * @generated
  */
  @Column(name = "ATEND_REGISTRA", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String atendRegistra;

  /**
  * @generated
  */
  @Column(name = "ATEST_STAMPRECEP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String atestStamprecep;

  /**
  * @generated
  */
  @Column(name = "AUMENTA_VAGALEITOAUTO", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String aumentaVagaleitoauto;

  /**
  * @generated
  */
  @Column(name = "AUTOIMP_VAC", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String autoimpVac;

  /**
  * @generated
  */
  @Column(name = "autoimpressao", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String autoimpressao;

  /**
  * @generated
  */
  @Column(name = "autoimprlistaespera", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String autoimprlistaespera;

  /**
  * @generated
  */
  @Column(name = "bairro", nullable = true, unique = false, length=50, insertable=true, updatable=true)
  
  private java.lang.String bairro;

  /**
  * @generated
  */
  @Column(name = "BUSCA_COMP_FARMA", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String buscaCompFarma;

  /**
  * @generated
  */
  @Column(name = "CADPAC_CNS", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String cadpacCns;

  /**
  * @generated
  */
  @Column(name = "CADPAC_COR", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String cadpacCor;

  /**
  * @generated
  */
  @Column(name = "CADPAC_CPF", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String cadpacCpf;

  /**
  * @generated
  */
  @Column(name = "CADPAC_ENDERECO", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String cadpacEndereco;

  /**
  * @generated
  */
  @Column(name = "CADPAC_ESTADO_CIVIL", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String cadpacEstadoCivil;

  /**
  * @generated
  */
  @Column(name = "CADPAC_EXIBE_OUTRO_PRONT", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String cadpacExibeOutroPront;

  /**
  * @generated
  */
  @Column(name = "CADPAC_IDENTIDADE", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String cadpacIdentidade;

  /**
  * @generated
  */
  @Column(name = "CADPAC_NATURALIDADE", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String cadpacNaturalidade;

  /**
  * @generated
  */
  @Column(name = "CADPAC_NOME_ETIQ_PAC", nullable = true, unique = false, length=30, insertable=true, updatable=true)
  
  private java.lang.String cadpacNomeEtiqPac;

  /**
  * @generated
  */
  @Column(name = "CADPAC_US_REF", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String cadpacUsRef;

  /**
  * @generated
  */
  @Column(name = "CADPAC_US_REF_RESTRITA", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String cadpacUsRefRestrita;

  /**
  * @generated
  */
  @Column(name = "CADPROF_CNS", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String cadprofCns;

  /**
  * @generated
  */
  @Column(name = "CARTA_AG_REM_MARG_ESQ", nullable = true, unique = false, length=3, insertable=true, updatable=true)
  
  private java.lang.Integer cartaAgRemMargEsq;

  /**
  * @generated
  */
  @Column(name = "CARTA_AG_REM_MARG_SUP", nullable = true, unique = false, length=3, insertable=true, updatable=true)
  
  private java.lang.Integer cartaAgRemMargSup;

  /**
  * @generated
  */
  @Column(name = "CENTRALENF_PADRAO", nullable = true, unique = false, length=20, insertable=true, updatable=true)
  
  private java.lang.String centralenfPadrao;

  /**
  * @generated
  */
  @Column(name = "cep", nullable = true, unique = false, length=8, insertable=true, updatable=true)
  
  private java.lang.String cep;

  /**
  * @generated
  */
  @Column(name = "cgc", nullable = true, unique = false, length=14, insertable=true, updatable=true)
  
  private java.lang.Long cgc;

  /**
  * @generated
  */
  @Column(name = "cnsobr", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String cnsobr;

  /**
  * @generated
  */
  @Column(name = "CODUNIDSAU_INTEGRACAO", nullable = true, unique = false, length=15, insertable=true, updatable=true)
  
  private java.lang.String codunidsauIntegracao;

  /**
  * @generated
  */
  @Column(name = "complend", nullable = true, unique = false, length=50, insertable=true, updatable=true)
  
  private java.lang.String complend;

  /**
  * @generated
  */
  @Column(name = "CONTROLA_ESPEC", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String controlaEspec;

  /**
  * @generated
  */
  @Column(name = "CONTROLA_ESPEC_MD", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String controlaEspecMd;

  /**
  * @generated
  */
  @Column(name = "CPF_DIRCLIN", nullable = true, unique = false, length=18, insertable=true, updatable=true)
  
  private java.lang.Long cpfDirclin;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "DATA_COTA", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.util.Date dataCota;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "DATA_COTA_EXAME", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.util.Date dataCotaExame;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "DATA_QUANT_ATEND", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.util.Date dataQuantAtend;

  /**
  * @generated
  */
  @Column(name = "distrito", nullable = true, unique = false, length=10, insertable=true, updatable=true)
  
  private java.lang.String distrito;

  /**
  * @generated
  */
  @Column(name = "ENCERRA_AUTO", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String encerraAuto;

  /**
  * @generated
  */
  @Column(name = "ender", nullable = true, unique = false, length=100, insertable=true, updatable=true)
  
  private java.lang.String ender;

  /**
  * @generated
  */
  @Column(name = "ENVIA_EMAIL", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String enviaEmail;

  /**
  * @generated
  */
  @Column(name = "ENVIA_SMS", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String enviaSms;

  /**
  * @generated
  */
  @Column(name = "ESCOLHEUS_PACAG", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String escolheusPacag;

  /**
  * @generated
  */
  @Column(name = "ESUS_EXIGEMICROA", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String esusExigemicroa;

  /**
  * @generated
  */
  @Column(name = "ETIQ_PAC_ALTURA", nullable = true, unique = false, length=3, insertable=true, updatable=true)
  
  private java.lang.Integer etiqPacAltura;

  /**
  * @generated
  */
  @Column(name = "ETIQ_PAC_ESPACO", nullable = true, unique = false, length=3, insertable=true, updatable=true)
  
  private java.lang.Integer etiqPacEspaco;

  /**
  * @generated
  */
  @Column(name = "ETIQ_PAC_LARGURA", nullable = true, unique = false, length=3, insertable=true, updatable=true)
  
  private java.lang.Integer etiqPacLargura;

  /**
  * @generated
  */
  @Column(name = "ETIQ_PAC_MARG_ESQ", nullable = true, unique = false, length=3, insertable=true, updatable=true)
  
  private java.lang.Integer etiqPacMargEsq;

  /**
  * @generated
  */
  @Column(name = "ETIQ_PAC_MARG_SUP", nullable = true, unique = false, length=3, insertable=true, updatable=true)
  
  private java.lang.Integer etiqPacMargSup;

  /**
  * @generated
  */
  @Column(name = "ETIQ_PAC_RECUO_ESQ", nullable = true, unique = false, length=3, insertable=true, updatable=true)
  
  private java.lang.Integer etiqPacRecuoEsq;

  /**
  * @generated
  */
  @Column(name = "ETQ_ACOMP_MARG_ESQ", nullable = true, unique = false, length=3, insertable=true, updatable=true)
  
  private java.lang.Integer etqAcompMargEsq;

  /**
  * @generated
  */
  @Column(name = "ETQ_ACOMP_MARG_SUP", nullable = true, unique = false, length=3, insertable=true, updatable=true)
  
  private java.lang.Integer etqAcompMargSup;

  /**
  * @generated
  */
  @Column(name = "ETQ_PUL_MARG_ESQ", nullable = true, unique = false, length=3, insertable=true, updatable=true)
  
  private java.lang.Integer etqPulMargEsq;

  /**
  * @generated
  */
  @Column(name = "ETQ_PUL_MARG_SUP", nullable = true, unique = false, length=3, insertable=true, updatable=true)
  
  private java.lang.Integer etqPulMargSup;

  /**
  * @generated
  */
  @Column(name = "EX_CLASS_RISCO", nullable = true, unique = false, length=20, insertable=true, updatable=true)
  
  private java.lang.String exClassRisco;

  /**
  * @generated
  */
  @Column(name = "EXIGE_CID_FILAAG", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String exigeCidFilaag;

  /**
  * @generated
  */
  @Column(name = "EXIGE_CID_REF", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String exigeCidRef;

  /**
  * @generated
  */
  @Column(name = "exigetipoleito", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String exigetipoleito;

  /**
  * @generated
  */
  @Column(name = "FAA_MARG_ESQ", nullable = true, unique = false, length=3, insertable=true, updatable=true)
  
  private java.lang.Integer faaMargEsq;

  /**
  * @generated
  */
  @Column(name = "FAA_MARG_SUP", nullable = true, unique = false, length=3, insertable=true, updatable=true)
  
  private java.lang.Integer faaMargSup;

  /**
  * @generated
  */
  @Column(name = "FAA_POS_MARG_ESQ", nullable = true, unique = false, length=3, insertable=true, updatable=true)
  
  private java.lang.Integer faaPosMargEsq;

  /**
  * @generated
  */
  @Column(name = "FAA_POS_MARG_SUP", nullable = true, unique = false, length=3, insertable=true, updatable=true)
  
  private java.lang.Integer faaPosMargSup;

  /**
  * @generated
  */
  @Column(name = "FARMACIA_ATPRESC_LOTE", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String farmaciaAtprescLote;

  /**
  * @generated
  */
  @Column(name = "FICH_ANOT_ENF", nullable = true, unique = false, length=20, insertable=true, updatable=true)
  
  private java.lang.String fichAnotEnf;

  /**
  * @generated
  */
  @Column(name = "FICH_CLASSRISC_AT", nullable = true, unique = false, length=20, insertable=true, updatable=true)
  
  private java.lang.String fichClassriscAt;

  /**
  * @generated
  */
  @Column(name = "FICH_EVOL_ENF", nullable = true, unique = false, length=20, insertable=true, updatable=true)
  
  private java.lang.String fichEvolEnf;

  /**
  * @generated
  */
  @Column(name = "FICH_SERV_SOCIAL", nullable = true, unique = false, length=20, insertable=true, updatable=true)
  
  private java.lang.String fichServSocial;

  /**
  * @generated
  */
  @Column(name = "FICH_SINAIS_VITAIS", nullable = true, unique = false, length=20, insertable=true, updatable=true)
  
  private java.lang.String fichSinaisVitais;

  /**
  * @generated
  */
  @Column(name = "FILAAT_REGEXP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String filaatRegexp;

  /**
  * @generated
  */
  @Column(name = "fone", nullable = true, unique = false, length=15, insertable=true, updatable=true)
  
  private java.lang.String fone;

  /**
  * @generated
  */
  @Column(name = "horacota", nullable = true, unique = false, length=2, insertable=true, updatable=true)
  
  private java.lang.Integer horacota;

  /**
  * @generated
  */
  @Column(name = "horarecep", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String horarecep;

  /**
  * @generated
  */
  @Column(name = "id", nullable = true, unique = false, length=5, insertable=true, updatable=true)
  
  private java.lang.Integer id;

  /**
  * @generated
  */
  @Column(name = "IDADE_CRIANCA_COLO", nullable = true, unique = false, length=2, insertable=true, updatable=true)
  
  private java.lang.Integer idadeCriancaColo;

  /**
  * @generated
  */
  @Column(name = "IDADE_SEM_CNS_AGD", nullable = true, unique = false, length=3, insertable=true, updatable=true)
  
  private java.lang.Integer idadeSemCnsAgd;

  /**
  * @generated
  */
  @Column(name = "IDADE_SEM_CNS_CAD", nullable = true, unique = false, length=3, insertable=true, updatable=true)
  
  private java.lang.Integer idadeSemCnsCad;

  /**
  * @generated
  */
  @Column(name = "IDADE_SEM_CNS_EXM", nullable = true, unique = false, length=3, insertable=true, updatable=true)
  
  private java.lang.Integer idadeSemCnsExm;

  /**
  * @generated
  */
  @Column(name = "IDADE_SEM_CNS_MED", nullable = true, unique = false, length=3, insertable=true, updatable=true)
  
  private java.lang.Integer idadeSemCnsMed;

  /**
  * @generated
  */
  @Column(name = "IDADE_SEM_CNS_RCP", nullable = true, unique = false, length=3, insertable=true, updatable=true)
  
  private java.lang.Integer idadeSemCnsRcp;

  /**
  * @generated
  */
  @Column(name = "IDADE_SEM_CNS_VAC", nullable = true, unique = false, length=3, insertable=true, updatable=true)
  
  private java.lang.Integer idadeSemCnsVac;

  /**
  * @generated
  */
  @Column(name = "impencematend", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String impencematend;

  /**
  * @generated
  */
  @Column(name = "imprecibo", nullable = true, unique = false, length=50, insertable=true, updatable=true)
  
  private java.lang.String imprecibo;

  /**
  * @generated
  */
  @Column(name = "informasenha", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String informasenha;

  /**
  * @generated
  */
  @Column(name = "LAB_ECG_UPA", nullable = true, unique = false, length=10, insertable=true, updatable=true)
  
  private java.lang.String labEcgUpa;

  /**
  * @generated
  */
  @Column(name = "latitude", nullable = true, unique = false, length=6, insertable=true, updatable=true)
  
  private java.lang.Double latitude;

  /**
  * @generated
  */
  @Column(name = "LEITO_SOL_OBS", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String leitoSolObs;

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
  @Column(name = "longitude", nullable = true, unique = false, length=6, insertable=true, updatable=true)
  
  private java.lang.Double longitude;

  /**
  * @generated
  */
  @Column(name = "manchester", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String manchester;

  /**
  * @generated
  */
  @Column(name = "MAX_NRC", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.Integer maxNrc;

  /**
  * @generated
  */
  @Column(name = "MBAIRRO_CODIGO", nullable = true, unique = false, length=10, insertable=true, updatable=true)
  
  private java.lang.String mbairroCodigo;

  /**
  * @generated
  */
  @Column(name = "MBAIRRO_MUNICIPIO_CODIGO", nullable = true, unique = false, length=10, insertable=true, updatable=true)
  
  private java.lang.String mbairroMunicipioCodigo;

  /**
  * @generated
  */
  @Column(name = "MOD_UPA_GENERO", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String modUpaGenero;

  /**
  * @generated
  */
  @Column(name = "MOD_UPA_NOME", nullable = true, unique = false, length=2, insertable=true, updatable=true)
  
  private java.lang.Integer modUpaNome;

  /**
  * @generated
  */
  @Column(name = "MODELO_CARTA_AG_REM", nullable = true, unique = false, length=50, insertable=true, updatable=true)
  
  private java.lang.String modeloCartaAgRem;

  /**
  * @generated
  */
  @Column(name = "MODELO_ETQ_ACOMP", nullable = true, unique = false, length=50, insertable=true, updatable=true)
  
  private java.lang.String modeloEtqAcomp;

  /**
  * @generated
  */
  @Column(name = "MODELO_ETQ_PUL", nullable = true, unique = false, length=50, insertable=true, updatable=true)
  
  private java.lang.String modeloEtqPul;

  /**
  * @generated
  */
  @Column(name = "MODELO_FAA", nullable = true, unique = false, length=50, insertable=true, updatable=true)
  
  private java.lang.String modeloFaa;

  /**
  * @generated
  */
  @Column(name = "MODELO_FAA_POS", nullable = true, unique = false, length=50, insertable=true, updatable=true)
  
  private java.lang.String modeloFaaPos;

  /**
  * @generated
  */
  @Column(name = "MODELO_GUIA_ENC", nullable = true, unique = false, length=50, insertable=true, updatable=true)
  
  private java.lang.String modeloGuiaEnc;

  /**
  * @generated
  */
  @Column(name = "MODELO_PACETIQUETA", nullable = true, unique = false, length=50, insertable=true, updatable=true)
  
  private java.lang.String modeloPacetiqueta;

  /**
  * @generated
  */
  @Column(name = "MODELO_PROTEXAME", nullable = true, unique = false, length=50, insertable=true, updatable=true)
  
  private java.lang.String modeloProtexame;

  /**
  * @generated
  */
  @Column(name = "MODELO_PROTGUIA", nullable = true, unique = false, length=50, insertable=true, updatable=true)
  
  private java.lang.String modeloProtguia;

  /**
  * @generated
  */
  @Column(name = "MODELO_RECEITA", nullable = true, unique = false, length=50, insertable=true, updatable=true)
  
  private java.lang.String modeloReceita;

  /**
  * @generated
  */
  @Column(name = "MODELO_RECEITALIVRE", nullable = true, unique = false, length=50, insertable=true, updatable=true)
  
  private java.lang.String modeloReceitalivre;

  /**
  * @generated
  */
  @Column(name = "MODELO_RECEXAME", nullable = true, unique = false, length=50, insertable=true, updatable=true)
  
  private java.lang.String modeloRecexame;

  /**
  * @generated
  */
  @Column(name = "MODELO_RECIBO", nullable = true, unique = false, length=50, insertable=true, updatable=true)
  
  private java.lang.String modeloRecibo;

  /**
  * @generated
  */
  @Column(name = "MODELO_SOLICINTPOS", nullable = true, unique = false, length=50, insertable=true, updatable=true)
  
  private java.lang.String modeloSolicintpos;

  /**
  * @generated
  */
  @Column(name = "MODELO_SOLICINTPRE", nullable = true, unique = false, length=50, insertable=true, updatable=true)
  
  private java.lang.String modeloSolicintpre;

  /**
  * @generated
  */
  @Column(name = "MOSTRA_ENDERECO", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String mostraEndereco;

  /**
  * @generated
  */
  @Column(name = "MOSTRA_INFOTRIAGEM", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String mostraInfotriagem;

  /**
  * @generated
  */
  @Column(name = "MOSTRA_PROFREQINT", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String mostraProfreqint;

  /**
  * @generated
  */
  @Column(name = "MOSTRA_USU_AGDADO", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String mostraUsuAgdado;

  /**
  * @generated
  */
  @Column(name = "MOSTRACNS_ATEND", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String mostracnsAtend;

  /**
  * @generated
  */
  @Column(name = "MOSTRACNS_PACAG", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String mostracnsPacag;

  /**
  * @generated
  */
  @Column(name = "MOSTRACONF_PACAG", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String mostraconfPacag;

  /**
  * @generated
  */
  @Column(name = "MOSTRADATANASC_ATEND", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String mostradatanascAtend;

  /**
  * @generated
  */
  @Column(name = "MOSTRADIA_PACAG", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String mostradiaPacag;

  /**
  * @generated
  */
  @Column(name = "MOSTRADIA_PACAGUS", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String mostradiaPacagus;

  /**
  * @generated
  */
  @Column(name = "MOSTRADIA_PACEX", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String mostradiaPacex;

  /**
  * @generated
  */
  @Column(name = "MOSTRADIA_PACEXUS", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String mostradiaPacexus;

  /**
  * @generated
  */
  @Column(name = "MOSTRAFAMILIA_PACAG", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String mostrafamiliaPacag;

  /**
  * @generated
  */
  @Column(name = "MOSTRAFONE_PACAG", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String mostrafonePacag;

  /**
  * @generated
  */
  @Column(name = "MOSTRAGRUPO_PACAG", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String mostragrupoPacag;

  /**
  * @generated
  */
  @Column(name = "MOSTRAGRUPO_PACAGUS", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String mostragrupoPacagus;

  /**
  * @generated
  */
  @Column(name = "MOSTRAGRUPO_PACEX", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String mostragrupoPacex;

  /**
  * @generated
  */
  @Column(name = "MOSTRAGRUPO_PACEXUS", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String mostragrupoPacexus;

  /**
  * @generated
  */
  @Column(name = "MOSTRAIDADE_PACAG", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String mostraidadePacag;

  /**
  * @generated
  */
  @Column(name = "MOSTRAIDADE_PACAGUS", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String mostraidadePacagus;

  /**
  * @generated
  */
  @Column(name = "MOSTRAIDADE_PACEX", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String mostraidadePacex;

  /**
  * @generated
  */
  @Column(name = "MOSTRAIDADE_PACEXUS", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String mostraidadePacexus;

  /**
  * @generated
  */
  @Column(name = "MOSTRANUMPAC_PACAG", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String mostranumpacPacag;

  /**
  * @generated
  */
  @Column(name = "MOSTRAPEDECARTAO_PACAG", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String mostrapedecartaoPacag;

  /**
  * @generated
  */
  @Column(name = "MOSTRAPOSSUICARTAO_PACAG", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String mostrapossuicartaoPacag;

  /**
  * @generated
  */
  @Column(name = "MOSTRAPRECON_ATEND", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String mostrapreconAtend;

  /**
  * @generated
  */
  @Column(name = "MOSTRASEXO_ATEND", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String mostrasexoAtend;

  /**
  * @generated
  */
  @Column(name = "MOSTRAUSREQ_PACAG", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String mostrausreqPacag;

  /**
  * @generated
  */
  @Column(name = "motivcancelint", nullable = true, unique = false, length=10, insertable=true, updatable=true)
  
  private java.lang.String motivcancelint;

  /**
  * @generated
  */
  @Column(name = "MOTIVO_CANCEL_SOLLEITOUPA", nullable = true, unique = false, length=10, insertable=true, updatable=true)
  
  private java.lang.String motivoCancelSolleitoupa;

  /**
  * @generated
  */
  @Column(name = "MSG_FAA", nullable = true, unique = false, length=200, insertable=true, updatable=true)
  
  private java.lang.String msgFaa;

  /**
  * @generated
  */
  @Column(name = "msgrecibo", nullable = true, unique = false, length=200, insertable=true, updatable=true)
  
  private java.lang.String msgrecibo;

  /**
  * @generated
  */
  @Column(name = "NAO_CTRL_AGD", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String naoCtrlAgd;

  /**
  * @generated
  */
  @Column(name = "NAO_CTRL_LEITO", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String naoCtrlLeito;

  /**
  * @generated
  */
  @Column(name = "NAO_ENC_EM_REGEXPRES", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String naoEncEmRegexpres;

  /**
  * @generated
  */
  @Column(name = "nome", nullable = true, unique = false, length=100, insertable=true, updatable=true)
  
  private java.lang.String nome;

  /**
  * @generated
  */
  @Column(name = "NOTIF_DENGUE_MARG_ESQ", nullable = true, unique = false, length=3, insertable=true, updatable=true)
  
  private java.lang.Integer notifDengueMargEsq;

  /**
  * @generated
  */
  @Column(name = "NOTIF_DENGUE_MARG_SUP", nullable = true, unique = false, length=3, insertable=true, updatable=true)
  
  private java.lang.Integer notifDengueMargSup;

  /**
  * @generated
  */
  @Column(name = "NOTIF_DENGUE_TIPO", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.Integer notifDengueTipo;

  /**
  * @generated
  */
  @Column(name = "numeroend", nullable = true, unique = false, length=5, insertable=true, updatable=true)
  
  private java.lang.String numeroend;

  /**
  * @generated
  */
  @Column(name = "OBRIGA_CLAS_RISCO", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String obrigaClasRisco;

  /**
  * @generated
  */
  @Column(name = "OBRIGA_PROF_RECEP", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String obrigaProfRecep;

  /**
  * @generated
  */
  @Column(name = "obrigasenha", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String obrigasenha;

  /**
  * @generated
  */
  @Column(name = "obsparaint", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String obsparaint;

  /**
  * @generated
  */
  @Column(name = "PAD_MED_ATEND", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String padMedAtend;

  /**
  * @generated
  */
  @Column(name = "PRAZO_ALT_LC", nullable = true, unique = false, length=3, insertable=true, updatable=true)
  
  private java.lang.Integer prazoAltLc;

  /**
  * @generated
  */
  @Column(name = "prazochamada", nullable = true, unique = false, length=3, insertable=true, updatable=true)
  
  private java.lang.Integer prazochamada;

  /**
  * @generated
  */
  @Column(name = "prazocota", nullable = true, unique = false, length=3, insertable=true, updatable=true)
  
  private java.lang.Integer prazocota;

  /**
  * @generated
  */
  @Column(name = "prazoretorno", nullable = true, unique = false, length=3, insertable=true, updatable=true)
  
  private java.lang.Integer prazoretorno;

  /**
  * @generated
  */
  @Column(name = "PRECON_EM_PRESCMED", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String preconEmPrescmed;

  /**
  * @generated
  */
  @Column(name = "PRECONS_CINTURA", nullable = true, unique = false, length=20, insertable=true, updatable=true)
  
  private java.lang.String preconsCintura;

  /**
  * @generated
  */
  @Column(name = "PRECONS_ESTATURA", nullable = true, unique = false, length=20, insertable=true, updatable=true)
  
  private java.lang.String preconsEstatura;

  /**
  * @generated
  */
  @Column(name = "PRECONS_FICHA", nullable = true, unique = false, length=20, insertable=true, updatable=true)
  
  private java.lang.String preconsFicha;

  /**
  * @generated
  */
  @Column(name = "PRECONS_FREQ_RESP", nullable = true, unique = false, length=20, insertable=true, updatable=true)
  
  private java.lang.String preconsFreqResp;

  /**
  * @generated
  */
  @Column(name = "PRECONS_GLI_JEJUM", nullable = true, unique = false, length=20, insertable=true, updatable=true)
  
  private java.lang.String preconsGliJejum;

  /**
  * @generated
  */
  @Column(name = "PRECONS_GLI_POSPRAN", nullable = true, unique = false, length=20, insertable=true, updatable=true)
  
  private java.lang.String preconsGliPospran;

  /**
  * @generated
  */
  @Column(name = "PRECONS_IMC", nullable = true, unique = false, length=20, insertable=true, updatable=true)
  
  private java.lang.String preconsImc;

  /**
  * @generated
  */
  @Column(name = "PRECONS_PADIAST", nullable = true, unique = false, length=20, insertable=true, updatable=true)
  
  private java.lang.String preconsPadiast;

  /**
  * @generated
  */
  @Column(name = "PRECONS_PASIST", nullable = true, unique = false, length=20, insertable=true, updatable=true)
  
  private java.lang.String preconsPasist;

  /**
  * @generated
  */
  @Column(name = "PRECONS_PER_CEF", nullable = true, unique = false, length=20, insertable=true, updatable=true)
  
  private java.lang.String preconsPerCef;

  /**
  * @generated
  */
  @Column(name = "PRECONS_PESO", nullable = true, unique = false, length=20, insertable=true, updatable=true)
  
  private java.lang.String preconsPeso;

  /**
  * @generated
  */
  @Column(name = "PRECONS_PULSO", nullable = true, unique = false, length=20, insertable=true, updatable=true)
  
  private java.lang.String preconsPulso;

  /**
  * @generated
  */
  @Column(name = "PRECONS_SAT_O2", nullable = true, unique = false, length=20, insertable=true, updatable=true)
  
  private java.lang.String preconsSatO2;

  /**
  * @generated
  */
  @Column(name = "PRECONS_TEMP", nullable = true, unique = false, length=20, insertable=true, updatable=true)
  
  private java.lang.String preconsTemp;

  /**
  * @generated
  */
  @Column(name = "PREENCHE_MICROAREA", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String preencheMicroarea;

  /**
  * @generated
  */
  @Column(name = "PRIORID_FARMA", nullable = true, unique = false, length=30, insertable=true, updatable=true)
  
  private java.lang.String prioridFarma;

  /**
  * @generated
  */
  @Column(name = "PROCED_AT", nullable = true, unique = false, length=10, insertable=true, updatable=true)
  
  private java.lang.String procedAt;

  /**
  * @generated
  */
  @Column(name = "PROCED_COLETA", nullable = true, unique = false, length=10, insertable=true, updatable=true)
  
  private java.lang.String procedColeta;

  /**
  * @generated
  */
  @Column(name = "PROCED_MED", nullable = true, unique = false, length=10, insertable=true, updatable=true)
  
  private java.lang.String procedMed;

  /**
  * @generated
  */
  @Column(name = "PROTEXAM_MARG_ESQ", nullable = true, unique = false, length=3, insertable=true, updatable=true)
  
  private java.lang.Integer protexamMargEsq;

  /**
  * @generated
  */
  @Column(name = "PROTEXAM_MARG_SUP", nullable = true, unique = false, length=3, insertable=true, updatable=true)
  
  private java.lang.Integer protexamMargSup;

  /**
  * @generated
  */
  @Column(name = "PROTGUIA_MARG_ESQ", nullable = true, unique = false, length=3, insertable=true, updatable=true)
  
  private java.lang.Integer protguiaMargEsq;

  /**
  * @generated
  */
  @Column(name = "PROTGUIA_MARG_SUP", nullable = true, unique = false, length=3, insertable=true, updatable=true)
  
  private java.lang.Integer protguiaMargSup;

  /**
  * @generated
  */
  @Column(name = "RAZAO_SOCIAL", nullable = true, unique = false, length=40, insertable=true, updatable=true)
  
  private java.lang.String razaoSocial;

  /**
  * @generated
  */
  @Column(name = "RECEITA_MARG_ESQ", nullable = true, unique = false, length=3, insertable=true, updatable=true)
  
  private java.lang.Integer receitaMargEsq;

  /**
  * @generated
  */
  @Column(name = "RECEITA_MARG_SUP", nullable = true, unique = false, length=3, insertable=true, updatable=true)
  
  private java.lang.Integer receitaMargSup;

  /**
  * @generated
  */
  @Column(name = "recepsenha", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String recepsenha;

  /**
  * @generated
  */
  @Column(name = "relatreqexame", nullable = true, unique = false, length=50, insertable=true, updatable=true)
  
  private java.lang.String relatreqexame;

  /**
  * @generated
  */
  @Column(name = "REQEXAM_MARG_ESQ", nullable = true, unique = false, length=3, insertable=true, updatable=true)
  
  private java.lang.Integer reqexamMargEsq;

  /**
  * @generated
  */
  @Column(name = "REQEXAM_MARG_SUP", nullable = true, unique = false, length=3, insertable=true, updatable=true)
  
  private java.lang.Integer reqexamMargSup;

  /**
  * @generated
  */
  @Column(name = "RESOLUCAO_PADRAO", nullable = true, unique = false, length=10, insertable=true, updatable=true)
  
  private java.lang.String resolucaoPadrao;

  /**
  * @generated
  */
  @Column(name = "RESPEITA_ESCALA", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String respeitaEscala;

  /**
  * @generated
  */
  @Column(name = "respons", nullable = true, unique = false, length=50, insertable=true, updatable=true)
  
  private java.lang.String respons;

  /**
  * @generated
  */
  @Column(name = "RESTR_AG_EX_US", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String restrAgExUs;

  /**
  * @generated
  */
  @Column(name = "RESTRINGE_LOTE_APLICVAC", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String restringeLoteAplicvac;

  /**
  * @generated
  */
  @Column(name = "restringerettipoat", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String restringerettipoat;

  /**
  * @generated
  */
  @Column(name = "retcontiguo", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String retcontiguo;

  /**
  * @generated
  */
  @Column(name = "sigla", nullable = true, unique = false, length=6, insertable=true, updatable=true)
  
  private java.lang.String sigla;

  /**
  * @generated
  */
  @Column(name = "tamanhosenha", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.Integer tamanhosenha;

  /**
  * @generated
  */
  @Column(name = "TEMPO_NAO_RESP", nullable = true, unique = false, length=4, insertable=true, updatable=true)
  
  private java.lang.Integer tempoNaoResp;

  /**
  * @generated
  */
  @Column(name = "TEMPO_PENALIDADE", nullable = true, unique = false, length=10, insertable=true, updatable=true)
  
  private java.lang.Long tempoPenalidade;

  /**
  * @generated
  */
  @Column(name = "tipologend", nullable = true, unique = false, length=5, insertable=true, updatable=true)
  
  private java.lang.String tipologend;

  /**
  * @generated
  */
  @Column(name = "TIPOUS_CODIGO", nullable = true, unique = false, length=10, insertable=true, updatable=true)
  
  private java.lang.String tipousCodigo;

  /**
  * @generated
  */
  @Column(name = "ufender", nullable = true, unique = false, length=2, insertable=true, updatable=true)
  
  private java.lang.String ufender;

  /**
  * @generated
  */
  @Column(name = "UPA_ACOL_CLASS_RISCO", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String upaAcolClassRisco;

  /**
  * @generated
  */
  @Column(name = "UPA_AUTOIMP_ETQPAC", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String upaAutoimpEtqpac;

  /**
  * @generated
  */
  @Column(name = "UPA_AUTOMIN_MED", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String upaAutominMed;

  /**
  * @generated
  */
  @Column(name = "UPA_CLASSRISCO", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String upaClassrisco;

  /**
  * @generated
  */
  @Column(name = "UPA_MOSTRA_LIVRE", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String upaMostraLivre;

  /**
  * @generated
  */
  @Column(name = "UPA_MOSTRA_REMO", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String upaMostraRemo;

  /**
  * @generated
  */
  @Column(name = "UPA_QUEIXAPRIMA", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String upaQueixaprima;

  /**
  * @generated
  */
  @Column(name = "UPA_SINAIS_VITAIS", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String upaSinaisVitais;

  /**
  * @generated
  */
  @Column(name = "USA_CHAMA_PAINEL", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String usaChamaPainel;

  /**
  * @generated
  */
  @Column(name = "USU_UPA", nullable = true, unique = false, length=15, insertable=true, updatable=true)
  
  private java.lang.String usuUpa;

  /**
  * @generated
  */
  @Column(name = "USU_UPA_FARMA", nullable = true, unique = false, length=15, insertable=true, updatable=true)
  
  private java.lang.String usuUpaFarma;

  /**
  * @generated
  */
  @Column(name = "USU_UPA_FARMA_SENHA", nullable = true, unique = false, length=64, insertable=true, updatable=true)
  
  private java.lang.String usuUpaFarmaSenha;

  /**
  * @generated
  */
  @Column(name = "USU_UPA_MED", nullable = true, unique = false, length=15, insertable=true, updatable=true)
  
  private java.lang.String usuUpaMed;

  /**
  * @generated
  */
  @Column(name = "USU_UPA_MED_SENHA", nullable = true, unique = false, length=64, insertable=true, updatable=true)
  
  private java.lang.String usuUpaMedSenha;

  /**
  * @generated
  */
  @Column(name = "USU_UPA_PROCED", nullable = true, unique = false, length=15, insertable=true, updatable=true)
  
  private java.lang.String usuUpaProced;

  /**
  * @generated
  */
  @Column(name = "USU_UPA_PROCED_SENHA", nullable = true, unique = false, length=64, insertable=true, updatable=true)
  
  private java.lang.String usuUpaProcedSenha;

  /**
  * @generated
  */
  @Column(name = "USU_UPA_SENHA", nullable = true, unique = false, length=64, insertable=true, updatable=true)
  
  private java.lang.String usuUpaSenha;

  /**
  * @generated
  */
  @Column(name = "vacina", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String vacina;

  /**
   * Construtor
   * @generated
   */
  public HyUnidsau(){
  }


  /**
   * Obtém abrev
   * return abrev
   * @generated
   */
  
  public java.lang.String getAbrev(){
    return this.abrev;
  }

  /**
   * Define abrev
   * @param abrev abrev
   * @generated
   */
  public HyUnidsau setAbrev(java.lang.String abrev){
    this.abrev = abrev;
    return this;
  }

  /**
   * Obtém altaint
   * return altaint
   * @generated
   */
  
  public java.lang.String getAltaint(){
    return this.altaint;
  }

  /**
   * Define altaint
   * @param altaint altaint
   * @generated
   */
  public HyUnidsau setAltaint(java.lang.String altaint){
    this.altaint = altaint;
    return this;
  }

  /**
   * Obtém atendMedicUpaCust
   * return atendMedicUpaCust
   * @generated
   */
  
  public java.lang.String getAtendMedicUpaCust(){
    return this.atendMedicUpaCust;
  }

  /**
   * Define atendMedicUpaCust
   * @param atendMedicUpaCust atendMedicUpaCust
   * @generated
   */
  public HyUnidsau setAtendMedicUpaCust(java.lang.String atendMedicUpaCust){
    this.atendMedicUpaCust = atendMedicUpaCust;
    return this;
  }

  /**
   * Obtém atendRegPagina
   * return atendRegPagina
   * @generated
   */
  
  public java.lang.String getAtendRegPagina(){
    return this.atendRegPagina;
  }

  /**
   * Define atendRegPagina
   * @param atendRegPagina atendRegPagina
   * @generated
   */
  public HyUnidsau setAtendRegPagina(java.lang.String atendRegPagina){
    this.atendRegPagina = atendRegPagina;
    return this;
  }

  /**
   * Obtém atendRegistra
   * return atendRegistra
   * @generated
   */
  
  public java.lang.String getAtendRegistra(){
    return this.atendRegistra;
  }

  /**
   * Define atendRegistra
   * @param atendRegistra atendRegistra
   * @generated
   */
  public HyUnidsau setAtendRegistra(java.lang.String atendRegistra){
    this.atendRegistra = atendRegistra;
    return this;
  }

  /**
   * Obtém atestStamprecep
   * return atestStamprecep
   * @generated
   */
  
  public java.lang.String getAtestStamprecep(){
    return this.atestStamprecep;
  }

  /**
   * Define atestStamprecep
   * @param atestStamprecep atestStamprecep
   * @generated
   */
  public HyUnidsau setAtestStamprecep(java.lang.String atestStamprecep){
    this.atestStamprecep = atestStamprecep;
    return this;
  }

  /**
   * Obtém aumentaVagaleitoauto
   * return aumentaVagaleitoauto
   * @generated
   */
  
  public java.lang.String getAumentaVagaleitoauto(){
    return this.aumentaVagaleitoauto;
  }

  /**
   * Define aumentaVagaleitoauto
   * @param aumentaVagaleitoauto aumentaVagaleitoauto
   * @generated
   */
  public HyUnidsau setAumentaVagaleitoauto(java.lang.String aumentaVagaleitoauto){
    this.aumentaVagaleitoauto = aumentaVagaleitoauto;
    return this;
  }

  /**
   * Obtém autoimpVac
   * return autoimpVac
   * @generated
   */
  
  public java.lang.String getAutoimpVac(){
    return this.autoimpVac;
  }

  /**
   * Define autoimpVac
   * @param autoimpVac autoimpVac
   * @generated
   */
  public HyUnidsau setAutoimpVac(java.lang.String autoimpVac){
    this.autoimpVac = autoimpVac;
    return this;
  }

  /**
   * Obtém autoimpressao
   * return autoimpressao
   * @generated
   */
  
  public java.lang.String getAutoimpressao(){
    return this.autoimpressao;
  }

  /**
   * Define autoimpressao
   * @param autoimpressao autoimpressao
   * @generated
   */
  public HyUnidsau setAutoimpressao(java.lang.String autoimpressao){
    this.autoimpressao = autoimpressao;
    return this;
  }

  /**
   * Obtém autoimprlistaespera
   * return autoimprlistaespera
   * @generated
   */
  
  public java.lang.String getAutoimprlistaespera(){
    return this.autoimprlistaespera;
  }

  /**
   * Define autoimprlistaespera
   * @param autoimprlistaespera autoimprlistaespera
   * @generated
   */
  public HyUnidsau setAutoimprlistaespera(java.lang.String autoimprlistaespera){
    this.autoimprlistaespera = autoimprlistaespera;
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
  public HyUnidsau setBairro(java.lang.String bairro){
    this.bairro = bairro;
    return this;
  }

  /**
   * Obtém buscaCompFarma
   * return buscaCompFarma
   * @generated
   */
  
  public java.lang.String getBuscaCompFarma(){
    return this.buscaCompFarma;
  }

  /**
   * Define buscaCompFarma
   * @param buscaCompFarma buscaCompFarma
   * @generated
   */
  public HyUnidsau setBuscaCompFarma(java.lang.String buscaCompFarma){
    this.buscaCompFarma = buscaCompFarma;
    return this;
  }

  /**
   * Obtém cadpacCns
   * return cadpacCns
   * @generated
   */
  
  public java.lang.String getCadpacCns(){
    return this.cadpacCns;
  }

  /**
   * Define cadpacCns
   * @param cadpacCns cadpacCns
   * @generated
   */
  public HyUnidsau setCadpacCns(java.lang.String cadpacCns){
    this.cadpacCns = cadpacCns;
    return this;
  }

  /**
   * Obtém cadpacCor
   * return cadpacCor
   * @generated
   */
  
  public java.lang.String getCadpacCor(){
    return this.cadpacCor;
  }

  /**
   * Define cadpacCor
   * @param cadpacCor cadpacCor
   * @generated
   */
  public HyUnidsau setCadpacCor(java.lang.String cadpacCor){
    this.cadpacCor = cadpacCor;
    return this;
  }

  /**
   * Obtém cadpacCpf
   * return cadpacCpf
   * @generated
   */
  
  public java.lang.String getCadpacCpf(){
    return this.cadpacCpf;
  }

  /**
   * Define cadpacCpf
   * @param cadpacCpf cadpacCpf
   * @generated
   */
  public HyUnidsau setCadpacCpf(java.lang.String cadpacCpf){
    this.cadpacCpf = cadpacCpf;
    return this;
  }

  /**
   * Obtém cadpacEndereco
   * return cadpacEndereco
   * @generated
   */
  
  public java.lang.String getCadpacEndereco(){
    return this.cadpacEndereco;
  }

  /**
   * Define cadpacEndereco
   * @param cadpacEndereco cadpacEndereco
   * @generated
   */
  public HyUnidsau setCadpacEndereco(java.lang.String cadpacEndereco){
    this.cadpacEndereco = cadpacEndereco;
    return this;
  }

  /**
   * Obtém cadpacEstadoCivil
   * return cadpacEstadoCivil
   * @generated
   */
  
  public java.lang.String getCadpacEstadoCivil(){
    return this.cadpacEstadoCivil;
  }

  /**
   * Define cadpacEstadoCivil
   * @param cadpacEstadoCivil cadpacEstadoCivil
   * @generated
   */
  public HyUnidsau setCadpacEstadoCivil(java.lang.String cadpacEstadoCivil){
    this.cadpacEstadoCivil = cadpacEstadoCivil;
    return this;
  }

  /**
   * Obtém cadpacExibeOutroPront
   * return cadpacExibeOutroPront
   * @generated
   */
  
  public java.lang.String getCadpacExibeOutroPront(){
    return this.cadpacExibeOutroPront;
  }

  /**
   * Define cadpacExibeOutroPront
   * @param cadpacExibeOutroPront cadpacExibeOutroPront
   * @generated
   */
  public HyUnidsau setCadpacExibeOutroPront(java.lang.String cadpacExibeOutroPront){
    this.cadpacExibeOutroPront = cadpacExibeOutroPront;
    return this;
  }

  /**
   * Obtém cadpacIdentidade
   * return cadpacIdentidade
   * @generated
   */
  
  public java.lang.String getCadpacIdentidade(){
    return this.cadpacIdentidade;
  }

  /**
   * Define cadpacIdentidade
   * @param cadpacIdentidade cadpacIdentidade
   * @generated
   */
  public HyUnidsau setCadpacIdentidade(java.lang.String cadpacIdentidade){
    this.cadpacIdentidade = cadpacIdentidade;
    return this;
  }

  /**
   * Obtém cadpacNaturalidade
   * return cadpacNaturalidade
   * @generated
   */
  
  public java.lang.String getCadpacNaturalidade(){
    return this.cadpacNaturalidade;
  }

  /**
   * Define cadpacNaturalidade
   * @param cadpacNaturalidade cadpacNaturalidade
   * @generated
   */
  public HyUnidsau setCadpacNaturalidade(java.lang.String cadpacNaturalidade){
    this.cadpacNaturalidade = cadpacNaturalidade;
    return this;
  }

  /**
   * Obtém cadpacNomeEtiqPac
   * return cadpacNomeEtiqPac
   * @generated
   */
  
  public java.lang.String getCadpacNomeEtiqPac(){
    return this.cadpacNomeEtiqPac;
  }

  /**
   * Define cadpacNomeEtiqPac
   * @param cadpacNomeEtiqPac cadpacNomeEtiqPac
   * @generated
   */
  public HyUnidsau setCadpacNomeEtiqPac(java.lang.String cadpacNomeEtiqPac){
    this.cadpacNomeEtiqPac = cadpacNomeEtiqPac;
    return this;
  }

  /**
   * Obtém cadpacUsRef
   * return cadpacUsRef
   * @generated
   */
  
  public java.lang.String getCadpacUsRef(){
    return this.cadpacUsRef;
  }

  /**
   * Define cadpacUsRef
   * @param cadpacUsRef cadpacUsRef
   * @generated
   */
  public HyUnidsau setCadpacUsRef(java.lang.String cadpacUsRef){
    this.cadpacUsRef = cadpacUsRef;
    return this;
  }

  /**
   * Obtém cadpacUsRefRestrita
   * return cadpacUsRefRestrita
   * @generated
   */
  
  public java.lang.String getCadpacUsRefRestrita(){
    return this.cadpacUsRefRestrita;
  }

  /**
   * Define cadpacUsRefRestrita
   * @param cadpacUsRefRestrita cadpacUsRefRestrita
   * @generated
   */
  public HyUnidsau setCadpacUsRefRestrita(java.lang.String cadpacUsRefRestrita){
    this.cadpacUsRefRestrita = cadpacUsRefRestrita;
    return this;
  }

  /**
   * Obtém cadprofCns
   * return cadprofCns
   * @generated
   */
  
  public java.lang.String getCadprofCns(){
    return this.cadprofCns;
  }

  /**
   * Define cadprofCns
   * @param cadprofCns cadprofCns
   * @generated
   */
  public HyUnidsau setCadprofCns(java.lang.String cadprofCns){
    this.cadprofCns = cadprofCns;
    return this;
  }

  /**
   * Obtém cartaAgRemMargEsq
   * return cartaAgRemMargEsq
   * @generated
   */
  
  public java.lang.Integer getCartaAgRemMargEsq(){
    return this.cartaAgRemMargEsq;
  }

  /**
   * Define cartaAgRemMargEsq
   * @param cartaAgRemMargEsq cartaAgRemMargEsq
   * @generated
   */
  public HyUnidsau setCartaAgRemMargEsq(java.lang.Integer cartaAgRemMargEsq){
    this.cartaAgRemMargEsq = cartaAgRemMargEsq;
    return this;
  }

  /**
   * Obtém cartaAgRemMargSup
   * return cartaAgRemMargSup
   * @generated
   */
  
  public java.lang.Integer getCartaAgRemMargSup(){
    return this.cartaAgRemMargSup;
  }

  /**
   * Define cartaAgRemMargSup
   * @param cartaAgRemMargSup cartaAgRemMargSup
   * @generated
   */
  public HyUnidsau setCartaAgRemMargSup(java.lang.Integer cartaAgRemMargSup){
    this.cartaAgRemMargSup = cartaAgRemMargSup;
    return this;
  }

  /**
   * Obtém centralenfPadrao
   * return centralenfPadrao
   * @generated
   */
  
  public java.lang.String getCentralenfPadrao(){
    return this.centralenfPadrao;
  }

  /**
   * Define centralenfPadrao
   * @param centralenfPadrao centralenfPadrao
   * @generated
   */
  public HyUnidsau setCentralenfPadrao(java.lang.String centralenfPadrao){
    this.centralenfPadrao = centralenfPadrao;
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
  public HyUnidsau setCep(java.lang.String cep){
    this.cep = cep;
    return this;
  }

  /**
   * Obtém cgc
   * return cgc
   * @generated
   */
  
  public java.lang.Long getCgc(){
    return this.cgc;
  }

  /**
   * Define cgc
   * @param cgc cgc
   * @generated
   */
  public HyUnidsau setCgc(java.lang.Long cgc){
    this.cgc = cgc;
    return this;
  }

  /**
   * Obtém cnsobr
   * return cnsobr
   * @generated
   */
  
  public java.lang.String getCnsobr(){
    return this.cnsobr;
  }

  /**
   * Define cnsobr
   * @param cnsobr cnsobr
   * @generated
   */
  public HyUnidsau setCnsobr(java.lang.String cnsobr){
    this.cnsobr = cnsobr;
    return this;
  }

  /**
   * Obtém codunidsau
   * return codunidsau
   * @generated
   */
  
  public java.lang.String getCodunidsau(){
    return this.codunidsau;
  }

  /**
   * Define codunidsau
   * @param codunidsau codunidsau
   * @generated
   */
  public HyUnidsau setCodunidsau(java.lang.String codunidsau){
    this.codunidsau = codunidsau;
    return this;
  }

  /**
   * Obtém codunidsauIntegracao
   * return codunidsauIntegracao
   * @generated
   */
  
  public java.lang.String getCodunidsauIntegracao(){
    return this.codunidsauIntegracao;
  }

  /**
   * Define codunidsauIntegracao
   * @param codunidsauIntegracao codunidsauIntegracao
   * @generated
   */
  public HyUnidsau setCodunidsauIntegracao(java.lang.String codunidsauIntegracao){
    this.codunidsauIntegracao = codunidsauIntegracao;
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
  public HyUnidsau setComplend(java.lang.String complend){
    this.complend = complend;
    return this;
  }

  /**
   * Obtém controlaEspec
   * return controlaEspec
   * @generated
   */
  
  public java.lang.String getControlaEspec(){
    return this.controlaEspec;
  }

  /**
   * Define controlaEspec
   * @param controlaEspec controlaEspec
   * @generated
   */
  public HyUnidsau setControlaEspec(java.lang.String controlaEspec){
    this.controlaEspec = controlaEspec;
    return this;
  }

  /**
   * Obtém controlaEspecMd
   * return controlaEspecMd
   * @generated
   */
  
  public java.lang.String getControlaEspecMd(){
    return this.controlaEspecMd;
  }

  /**
   * Define controlaEspecMd
   * @param controlaEspecMd controlaEspecMd
   * @generated
   */
  public HyUnidsau setControlaEspecMd(java.lang.String controlaEspecMd){
    this.controlaEspecMd = controlaEspecMd;
    return this;
  }

  /**
   * Obtém cpfDirclin
   * return cpfDirclin
   * @generated
   */
  
  public java.lang.Long getCpfDirclin(){
    return this.cpfDirclin;
  }

  /**
   * Define cpfDirclin
   * @param cpfDirclin cpfDirclin
   * @generated
   */
  public HyUnidsau setCpfDirclin(java.lang.Long cpfDirclin){
    this.cpfDirclin = cpfDirclin;
    return this;
  }

  /**
   * Obtém dataCota
   * return dataCota
   * @generated
   */
  
  public java.util.Date getDataCota(){
    return this.dataCota;
  }

  /**
   * Define dataCota
   * @param dataCota dataCota
   * @generated
   */
  public HyUnidsau setDataCota(java.util.Date dataCota){
    this.dataCota = dataCota;
    return this;
  }

  /**
   * Obtém dataCotaExame
   * return dataCotaExame
   * @generated
   */
  
  public java.util.Date getDataCotaExame(){
    return this.dataCotaExame;
  }

  /**
   * Define dataCotaExame
   * @param dataCotaExame dataCotaExame
   * @generated
   */
  public HyUnidsau setDataCotaExame(java.util.Date dataCotaExame){
    this.dataCotaExame = dataCotaExame;
    return this;
  }

  /**
   * Obtém dataQuantAtend
   * return dataQuantAtend
   * @generated
   */
  
  public java.util.Date getDataQuantAtend(){
    return this.dataQuantAtend;
  }

  /**
   * Define dataQuantAtend
   * @param dataQuantAtend dataQuantAtend
   * @generated
   */
  public HyUnidsau setDataQuantAtend(java.util.Date dataQuantAtend){
    this.dataQuantAtend = dataQuantAtend;
    return this;
  }

  /**
   * Obtém distrito
   * return distrito
   * @generated
   */
  
  public java.lang.String getDistrito(){
    return this.distrito;
  }

  /**
   * Define distrito
   * @param distrito distrito
   * @generated
   */
  public HyUnidsau setDistrito(java.lang.String distrito){
    this.distrito = distrito;
    return this;
  }

  /**
   * Obtém encerraAuto
   * return encerraAuto
   * @generated
   */
  
  public java.lang.String getEncerraAuto(){
    return this.encerraAuto;
  }

  /**
   * Define encerraAuto
   * @param encerraAuto encerraAuto
   * @generated
   */
  public HyUnidsau setEncerraAuto(java.lang.String encerraAuto){
    this.encerraAuto = encerraAuto;
    return this;
  }

  /**
   * Obtém ender
   * return ender
   * @generated
   */
  
  public java.lang.String getEnder(){
    return this.ender;
  }

  /**
   * Define ender
   * @param ender ender
   * @generated
   */
  public HyUnidsau setEnder(java.lang.String ender){
    this.ender = ender;
    return this;
  }

  /**
   * Obtém enviaEmail
   * return enviaEmail
   * @generated
   */
  
  public java.lang.String getEnviaEmail(){
    return this.enviaEmail;
  }

  /**
   * Define enviaEmail
   * @param enviaEmail enviaEmail
   * @generated
   */
  public HyUnidsau setEnviaEmail(java.lang.String enviaEmail){
    this.enviaEmail = enviaEmail;
    return this;
  }

  /**
   * Obtém enviaSms
   * return enviaSms
   * @generated
   */
  
  public java.lang.String getEnviaSms(){
    return this.enviaSms;
  }

  /**
   * Define enviaSms
   * @param enviaSms enviaSms
   * @generated
   */
  public HyUnidsau setEnviaSms(java.lang.String enviaSms){
    this.enviaSms = enviaSms;
    return this;
  }

  /**
   * Obtém escolheusPacag
   * return escolheusPacag
   * @generated
   */
  
  public java.lang.String getEscolheusPacag(){
    return this.escolheusPacag;
  }

  /**
   * Define escolheusPacag
   * @param escolheusPacag escolheusPacag
   * @generated
   */
  public HyUnidsau setEscolheusPacag(java.lang.String escolheusPacag){
    this.escolheusPacag = escolheusPacag;
    return this;
  }

  /**
   * Obtém esusExigemicroa
   * return esusExigemicroa
   * @generated
   */
  
  public java.lang.String getEsusExigemicroa(){
    return this.esusExigemicroa;
  }

  /**
   * Define esusExigemicroa
   * @param esusExigemicroa esusExigemicroa
   * @generated
   */
  public HyUnidsau setEsusExigemicroa(java.lang.String esusExigemicroa){
    this.esusExigemicroa = esusExigemicroa;
    return this;
  }

  /**
   * Obtém etiqPacAltura
   * return etiqPacAltura
   * @generated
   */
  
  public java.lang.Integer getEtiqPacAltura(){
    return this.etiqPacAltura;
  }

  /**
   * Define etiqPacAltura
   * @param etiqPacAltura etiqPacAltura
   * @generated
   */
  public HyUnidsau setEtiqPacAltura(java.lang.Integer etiqPacAltura){
    this.etiqPacAltura = etiqPacAltura;
    return this;
  }

  /**
   * Obtém etiqPacEspaco
   * return etiqPacEspaco
   * @generated
   */
  
  public java.lang.Integer getEtiqPacEspaco(){
    return this.etiqPacEspaco;
  }

  /**
   * Define etiqPacEspaco
   * @param etiqPacEspaco etiqPacEspaco
   * @generated
   */
  public HyUnidsau setEtiqPacEspaco(java.lang.Integer etiqPacEspaco){
    this.etiqPacEspaco = etiqPacEspaco;
    return this;
  }

  /**
   * Obtém etiqPacLargura
   * return etiqPacLargura
   * @generated
   */
  
  public java.lang.Integer getEtiqPacLargura(){
    return this.etiqPacLargura;
  }

  /**
   * Define etiqPacLargura
   * @param etiqPacLargura etiqPacLargura
   * @generated
   */
  public HyUnidsau setEtiqPacLargura(java.lang.Integer etiqPacLargura){
    this.etiqPacLargura = etiqPacLargura;
    return this;
  }

  /**
   * Obtém etiqPacMargEsq
   * return etiqPacMargEsq
   * @generated
   */
  
  public java.lang.Integer getEtiqPacMargEsq(){
    return this.etiqPacMargEsq;
  }

  /**
   * Define etiqPacMargEsq
   * @param etiqPacMargEsq etiqPacMargEsq
   * @generated
   */
  public HyUnidsau setEtiqPacMargEsq(java.lang.Integer etiqPacMargEsq){
    this.etiqPacMargEsq = etiqPacMargEsq;
    return this;
  }

  /**
   * Obtém etiqPacMargSup
   * return etiqPacMargSup
   * @generated
   */
  
  public java.lang.Integer getEtiqPacMargSup(){
    return this.etiqPacMargSup;
  }

  /**
   * Define etiqPacMargSup
   * @param etiqPacMargSup etiqPacMargSup
   * @generated
   */
  public HyUnidsau setEtiqPacMargSup(java.lang.Integer etiqPacMargSup){
    this.etiqPacMargSup = etiqPacMargSup;
    return this;
  }

  /**
   * Obtém etiqPacRecuoEsq
   * return etiqPacRecuoEsq
   * @generated
   */
  
  public java.lang.Integer getEtiqPacRecuoEsq(){
    return this.etiqPacRecuoEsq;
  }

  /**
   * Define etiqPacRecuoEsq
   * @param etiqPacRecuoEsq etiqPacRecuoEsq
   * @generated
   */
  public HyUnidsau setEtiqPacRecuoEsq(java.lang.Integer etiqPacRecuoEsq){
    this.etiqPacRecuoEsq = etiqPacRecuoEsq;
    return this;
  }

  /**
   * Obtém etqAcompMargEsq
   * return etqAcompMargEsq
   * @generated
   */
  
  public java.lang.Integer getEtqAcompMargEsq(){
    return this.etqAcompMargEsq;
  }

  /**
   * Define etqAcompMargEsq
   * @param etqAcompMargEsq etqAcompMargEsq
   * @generated
   */
  public HyUnidsau setEtqAcompMargEsq(java.lang.Integer etqAcompMargEsq){
    this.etqAcompMargEsq = etqAcompMargEsq;
    return this;
  }

  /**
   * Obtém etqAcompMargSup
   * return etqAcompMargSup
   * @generated
   */
  
  public java.lang.Integer getEtqAcompMargSup(){
    return this.etqAcompMargSup;
  }

  /**
   * Define etqAcompMargSup
   * @param etqAcompMargSup etqAcompMargSup
   * @generated
   */
  public HyUnidsau setEtqAcompMargSup(java.lang.Integer etqAcompMargSup){
    this.etqAcompMargSup = etqAcompMargSup;
    return this;
  }

  /**
   * Obtém etqPulMargEsq
   * return etqPulMargEsq
   * @generated
   */
  
  public java.lang.Integer getEtqPulMargEsq(){
    return this.etqPulMargEsq;
  }

  /**
   * Define etqPulMargEsq
   * @param etqPulMargEsq etqPulMargEsq
   * @generated
   */
  public HyUnidsau setEtqPulMargEsq(java.lang.Integer etqPulMargEsq){
    this.etqPulMargEsq = etqPulMargEsq;
    return this;
  }

  /**
   * Obtém etqPulMargSup
   * return etqPulMargSup
   * @generated
   */
  
  public java.lang.Integer getEtqPulMargSup(){
    return this.etqPulMargSup;
  }

  /**
   * Define etqPulMargSup
   * @param etqPulMargSup etqPulMargSup
   * @generated
   */
  public HyUnidsau setEtqPulMargSup(java.lang.Integer etqPulMargSup){
    this.etqPulMargSup = etqPulMargSup;
    return this;
  }

  /**
   * Obtém exClassRisco
   * return exClassRisco
   * @generated
   */
  
  public java.lang.String getExClassRisco(){
    return this.exClassRisco;
  }

  /**
   * Define exClassRisco
   * @param exClassRisco exClassRisco
   * @generated
   */
  public HyUnidsau setExClassRisco(java.lang.String exClassRisco){
    this.exClassRisco = exClassRisco;
    return this;
  }

  /**
   * Obtém exigeCidFilaag
   * return exigeCidFilaag
   * @generated
   */
  
  public java.lang.String getExigeCidFilaag(){
    return this.exigeCidFilaag;
  }

  /**
   * Define exigeCidFilaag
   * @param exigeCidFilaag exigeCidFilaag
   * @generated
   */
  public HyUnidsau setExigeCidFilaag(java.lang.String exigeCidFilaag){
    this.exigeCidFilaag = exigeCidFilaag;
    return this;
  }

  /**
   * Obtém exigeCidRef
   * return exigeCidRef
   * @generated
   */
  
  public java.lang.String getExigeCidRef(){
    return this.exigeCidRef;
  }

  /**
   * Define exigeCidRef
   * @param exigeCidRef exigeCidRef
   * @generated
   */
  public HyUnidsau setExigeCidRef(java.lang.String exigeCidRef){
    this.exigeCidRef = exigeCidRef;
    return this;
  }

  /**
   * Obtém exigetipoleito
   * return exigetipoleito
   * @generated
   */
  
  public java.lang.String getExigetipoleito(){
    return this.exigetipoleito;
  }

  /**
   * Define exigetipoleito
   * @param exigetipoleito exigetipoleito
   * @generated
   */
  public HyUnidsau setExigetipoleito(java.lang.String exigetipoleito){
    this.exigetipoleito = exigetipoleito;
    return this;
  }

  /**
   * Obtém faaMargEsq
   * return faaMargEsq
   * @generated
   */
  
  public java.lang.Integer getFaaMargEsq(){
    return this.faaMargEsq;
  }

  /**
   * Define faaMargEsq
   * @param faaMargEsq faaMargEsq
   * @generated
   */
  public HyUnidsau setFaaMargEsq(java.lang.Integer faaMargEsq){
    this.faaMargEsq = faaMargEsq;
    return this;
  }

  /**
   * Obtém faaMargSup
   * return faaMargSup
   * @generated
   */
  
  public java.lang.Integer getFaaMargSup(){
    return this.faaMargSup;
  }

  /**
   * Define faaMargSup
   * @param faaMargSup faaMargSup
   * @generated
   */
  public HyUnidsau setFaaMargSup(java.lang.Integer faaMargSup){
    this.faaMargSup = faaMargSup;
    return this;
  }

  /**
   * Obtém faaPosMargEsq
   * return faaPosMargEsq
   * @generated
   */
  
  public java.lang.Integer getFaaPosMargEsq(){
    return this.faaPosMargEsq;
  }

  /**
   * Define faaPosMargEsq
   * @param faaPosMargEsq faaPosMargEsq
   * @generated
   */
  public HyUnidsau setFaaPosMargEsq(java.lang.Integer faaPosMargEsq){
    this.faaPosMargEsq = faaPosMargEsq;
    return this;
  }

  /**
   * Obtém faaPosMargSup
   * return faaPosMargSup
   * @generated
   */
  
  public java.lang.Integer getFaaPosMargSup(){
    return this.faaPosMargSup;
  }

  /**
   * Define faaPosMargSup
   * @param faaPosMargSup faaPosMargSup
   * @generated
   */
  public HyUnidsau setFaaPosMargSup(java.lang.Integer faaPosMargSup){
    this.faaPosMargSup = faaPosMargSup;
    return this;
  }

  /**
   * Obtém farmaciaAtprescLote
   * return farmaciaAtprescLote
   * @generated
   */
  
  public java.lang.String getFarmaciaAtprescLote(){
    return this.farmaciaAtprescLote;
  }

  /**
   * Define farmaciaAtprescLote
   * @param farmaciaAtprescLote farmaciaAtprescLote
   * @generated
   */
  public HyUnidsau setFarmaciaAtprescLote(java.lang.String farmaciaAtprescLote){
    this.farmaciaAtprescLote = farmaciaAtprescLote;
    return this;
  }

  /**
   * Obtém fichAnotEnf
   * return fichAnotEnf
   * @generated
   */
  
  public java.lang.String getFichAnotEnf(){
    return this.fichAnotEnf;
  }

  /**
   * Define fichAnotEnf
   * @param fichAnotEnf fichAnotEnf
   * @generated
   */
  public HyUnidsau setFichAnotEnf(java.lang.String fichAnotEnf){
    this.fichAnotEnf = fichAnotEnf;
    return this;
  }

  /**
   * Obtém fichClassriscAt
   * return fichClassriscAt
   * @generated
   */
  
  public java.lang.String getFichClassriscAt(){
    return this.fichClassriscAt;
  }

  /**
   * Define fichClassriscAt
   * @param fichClassriscAt fichClassriscAt
   * @generated
   */
  public HyUnidsau setFichClassriscAt(java.lang.String fichClassriscAt){
    this.fichClassriscAt = fichClassriscAt;
    return this;
  }

  /**
   * Obtém fichEvolEnf
   * return fichEvolEnf
   * @generated
   */
  
  public java.lang.String getFichEvolEnf(){
    return this.fichEvolEnf;
  }

  /**
   * Define fichEvolEnf
   * @param fichEvolEnf fichEvolEnf
   * @generated
   */
  public HyUnidsau setFichEvolEnf(java.lang.String fichEvolEnf){
    this.fichEvolEnf = fichEvolEnf;
    return this;
  }

  /**
   * Obtém fichServSocial
   * return fichServSocial
   * @generated
   */
  
  public java.lang.String getFichServSocial(){
    return this.fichServSocial;
  }

  /**
   * Define fichServSocial
   * @param fichServSocial fichServSocial
   * @generated
   */
  public HyUnidsau setFichServSocial(java.lang.String fichServSocial){
    this.fichServSocial = fichServSocial;
    return this;
  }

  /**
   * Obtém fichSinaisVitais
   * return fichSinaisVitais
   * @generated
   */
  
  public java.lang.String getFichSinaisVitais(){
    return this.fichSinaisVitais;
  }

  /**
   * Define fichSinaisVitais
   * @param fichSinaisVitais fichSinaisVitais
   * @generated
   */
  public HyUnidsau setFichSinaisVitais(java.lang.String fichSinaisVitais){
    this.fichSinaisVitais = fichSinaisVitais;
    return this;
  }

  /**
   * Obtém filaatRegexp
   * return filaatRegexp
   * @generated
   */
  
  public java.lang.String getFilaatRegexp(){
    return this.filaatRegexp;
  }

  /**
   * Define filaatRegexp
   * @param filaatRegexp filaatRegexp
   * @generated
   */
  public HyUnidsau setFilaatRegexp(java.lang.String filaatRegexp){
    this.filaatRegexp = filaatRegexp;
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
  public HyUnidsau setFone(java.lang.String fone){
    this.fone = fone;
    return this;
  }

  /**
   * Obtém horacota
   * return horacota
   * @generated
   */
  
  public java.lang.Integer getHoracota(){
    return this.horacota;
  }

  /**
   * Define horacota
   * @param horacota horacota
   * @generated
   */
  public HyUnidsau setHoracota(java.lang.Integer horacota){
    this.horacota = horacota;
    return this;
  }

  /**
   * Obtém horarecep
   * return horarecep
   * @generated
   */
  
  public java.lang.String getHorarecep(){
    return this.horarecep;
  }

  /**
   * Define horarecep
   * @param horarecep horarecep
   * @generated
   */
  public HyUnidsau setHorarecep(java.lang.String horarecep){
    this.horarecep = horarecep;
    return this;
  }

  /**
   * Obtém id
   * return id
   * @generated
   */
  
  public java.lang.Integer getId(){
    return this.id;
  }

  /**
   * Define id
   * @param id id
   * @generated
   */
  public HyUnidsau setId(java.lang.Integer id){
    this.id = id;
    return this;
  }

  /**
   * Obtém idadeCriancaColo
   * return idadeCriancaColo
   * @generated
   */
  
  public java.lang.Integer getIdadeCriancaColo(){
    return this.idadeCriancaColo;
  }

  /**
   * Define idadeCriancaColo
   * @param idadeCriancaColo idadeCriancaColo
   * @generated
   */
  public HyUnidsau setIdadeCriancaColo(java.lang.Integer idadeCriancaColo){
    this.idadeCriancaColo = idadeCriancaColo;
    return this;
  }

  /**
   * Obtém idadeSemCnsAgd
   * return idadeSemCnsAgd
   * @generated
   */
  
  public java.lang.Integer getIdadeSemCnsAgd(){
    return this.idadeSemCnsAgd;
  }

  /**
   * Define idadeSemCnsAgd
   * @param idadeSemCnsAgd idadeSemCnsAgd
   * @generated
   */
  public HyUnidsau setIdadeSemCnsAgd(java.lang.Integer idadeSemCnsAgd){
    this.idadeSemCnsAgd = idadeSemCnsAgd;
    return this;
  }

  /**
   * Obtém idadeSemCnsCad
   * return idadeSemCnsCad
   * @generated
   */
  
  public java.lang.Integer getIdadeSemCnsCad(){
    return this.idadeSemCnsCad;
  }

  /**
   * Define idadeSemCnsCad
   * @param idadeSemCnsCad idadeSemCnsCad
   * @generated
   */
  public HyUnidsau setIdadeSemCnsCad(java.lang.Integer idadeSemCnsCad){
    this.idadeSemCnsCad = idadeSemCnsCad;
    return this;
  }

  /**
   * Obtém idadeSemCnsExm
   * return idadeSemCnsExm
   * @generated
   */
  
  public java.lang.Integer getIdadeSemCnsExm(){
    return this.idadeSemCnsExm;
  }

  /**
   * Define idadeSemCnsExm
   * @param idadeSemCnsExm idadeSemCnsExm
   * @generated
   */
  public HyUnidsau setIdadeSemCnsExm(java.lang.Integer idadeSemCnsExm){
    this.idadeSemCnsExm = idadeSemCnsExm;
    return this;
  }

  /**
   * Obtém idadeSemCnsMed
   * return idadeSemCnsMed
   * @generated
   */
  
  public java.lang.Integer getIdadeSemCnsMed(){
    return this.idadeSemCnsMed;
  }

  /**
   * Define idadeSemCnsMed
   * @param idadeSemCnsMed idadeSemCnsMed
   * @generated
   */
  public HyUnidsau setIdadeSemCnsMed(java.lang.Integer idadeSemCnsMed){
    this.idadeSemCnsMed = idadeSemCnsMed;
    return this;
  }

  /**
   * Obtém idadeSemCnsRcp
   * return idadeSemCnsRcp
   * @generated
   */
  
  public java.lang.Integer getIdadeSemCnsRcp(){
    return this.idadeSemCnsRcp;
  }

  /**
   * Define idadeSemCnsRcp
   * @param idadeSemCnsRcp idadeSemCnsRcp
   * @generated
   */
  public HyUnidsau setIdadeSemCnsRcp(java.lang.Integer idadeSemCnsRcp){
    this.idadeSemCnsRcp = idadeSemCnsRcp;
    return this;
  }

  /**
   * Obtém idadeSemCnsVac
   * return idadeSemCnsVac
   * @generated
   */
  
  public java.lang.Integer getIdadeSemCnsVac(){
    return this.idadeSemCnsVac;
  }

  /**
   * Define idadeSemCnsVac
   * @param idadeSemCnsVac idadeSemCnsVac
   * @generated
   */
  public HyUnidsau setIdadeSemCnsVac(java.lang.Integer idadeSemCnsVac){
    this.idadeSemCnsVac = idadeSemCnsVac;
    return this;
  }

  /**
   * Obtém impencematend
   * return impencematend
   * @generated
   */
  
  public java.lang.String getImpencematend(){
    return this.impencematend;
  }

  /**
   * Define impencematend
   * @param impencematend impencematend
   * @generated
   */
  public HyUnidsau setImpencematend(java.lang.String impencematend){
    this.impencematend = impencematend;
    return this;
  }

  /**
   * Obtém imprecibo
   * return imprecibo
   * @generated
   */
  
  public java.lang.String getImprecibo(){
    return this.imprecibo;
  }

  /**
   * Define imprecibo
   * @param imprecibo imprecibo
   * @generated
   */
  public HyUnidsau setImprecibo(java.lang.String imprecibo){
    this.imprecibo = imprecibo;
    return this;
  }

  /**
   * Obtém informasenha
   * return informasenha
   * @generated
   */
  
  public java.lang.String getInformasenha(){
    return this.informasenha;
  }

  /**
   * Define informasenha
   * @param informasenha informasenha
   * @generated
   */
  public HyUnidsau setInformasenha(java.lang.String informasenha){
    this.informasenha = informasenha;
    return this;
  }

  /**
   * Obtém labEcgUpa
   * return labEcgUpa
   * @generated
   */
  
  public java.lang.String getLabEcgUpa(){
    return this.labEcgUpa;
  }

  /**
   * Define labEcgUpa
   * @param labEcgUpa labEcgUpa
   * @generated
   */
  public HyUnidsau setLabEcgUpa(java.lang.String labEcgUpa){
    this.labEcgUpa = labEcgUpa;
    return this;
  }

  /**
   * Obtém latitude
   * return latitude
   * @generated
   */
  
  public java.lang.Double getLatitude(){
    return this.latitude;
  }

  /**
   * Define latitude
   * @param latitude latitude
   * @generated
   */
  public HyUnidsau setLatitude(java.lang.Double latitude){
    this.latitude = latitude;
    return this;
  }

  /**
   * Obtém leitoSolObs
   * return leitoSolObs
   * @generated
   */
  
  public java.lang.String getLeitoSolObs(){
    return this.leitoSolObs;
  }

  /**
   * Define leitoSolObs
   * @param leitoSolObs leitoSolObs
   * @generated
   */
  public HyUnidsau setLeitoSolObs(java.lang.String leitoSolObs){
    this.leitoSolObs = leitoSolObs;
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
  public HyUnidsau setLogrCodigo(java.lang.String logrCodigo){
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
  public HyUnidsau setLogradouro(java.lang.String logradouro){
    this.logradouro = logradouro;
    return this;
  }

  /**
   * Obtém longitude
   * return longitude
   * @generated
   */
  
  public java.lang.Double getLongitude(){
    return this.longitude;
  }

  /**
   * Define longitude
   * @param longitude longitude
   * @generated
   */
  public HyUnidsau setLongitude(java.lang.Double longitude){
    this.longitude = longitude;
    return this;
  }

  /**
   * Obtém manchester
   * return manchester
   * @generated
   */
  
  public java.lang.String getManchester(){
    return this.manchester;
  }

  /**
   * Define manchester
   * @param manchester manchester
   * @generated
   */
  public HyUnidsau setManchester(java.lang.String manchester){
    this.manchester = manchester;
    return this;
  }

  /**
   * Obtém maxNrc
   * return maxNrc
   * @generated
   */
  
  public java.lang.Integer getMaxNrc(){
    return this.maxNrc;
  }

  /**
   * Define maxNrc
   * @param maxNrc maxNrc
   * @generated
   */
  public HyUnidsau setMaxNrc(java.lang.Integer maxNrc){
    this.maxNrc = maxNrc;
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
  public HyUnidsau setMbairroCodigo(java.lang.String mbairroCodigo){
    this.mbairroCodigo = mbairroCodigo;
    return this;
  }

  /**
   * Obtém mbairroMunicipioCodigo
   * return mbairroMunicipioCodigo
   * @generated
   */
  
  public java.lang.String getMbairroMunicipioCodigo(){
    return this.mbairroMunicipioCodigo;
  }

  /**
   * Define mbairroMunicipioCodigo
   * @param mbairroMunicipioCodigo mbairroMunicipioCodigo
   * @generated
   */
  public HyUnidsau setMbairroMunicipioCodigo(java.lang.String mbairroMunicipioCodigo){
    this.mbairroMunicipioCodigo = mbairroMunicipioCodigo;
    return this;
  }

  /**
   * Obtém modUpaGenero
   * return modUpaGenero
   * @generated
   */
  
  public java.lang.String getModUpaGenero(){
    return this.modUpaGenero;
  }

  /**
   * Define modUpaGenero
   * @param modUpaGenero modUpaGenero
   * @generated
   */
  public HyUnidsau setModUpaGenero(java.lang.String modUpaGenero){
    this.modUpaGenero = modUpaGenero;
    return this;
  }

  /**
   * Obtém modUpaNome
   * return modUpaNome
   * @generated
   */
  
  public java.lang.Integer getModUpaNome(){
    return this.modUpaNome;
  }

  /**
   * Define modUpaNome
   * @param modUpaNome modUpaNome
   * @generated
   */
  public HyUnidsau setModUpaNome(java.lang.Integer modUpaNome){
    this.modUpaNome = modUpaNome;
    return this;
  }

  /**
   * Obtém modeloCartaAgRem
   * return modeloCartaAgRem
   * @generated
   */
  
  public java.lang.String getModeloCartaAgRem(){
    return this.modeloCartaAgRem;
  }

  /**
   * Define modeloCartaAgRem
   * @param modeloCartaAgRem modeloCartaAgRem
   * @generated
   */
  public HyUnidsau setModeloCartaAgRem(java.lang.String modeloCartaAgRem){
    this.modeloCartaAgRem = modeloCartaAgRem;
    return this;
  }

  /**
   * Obtém modeloEtqAcomp
   * return modeloEtqAcomp
   * @generated
   */
  
  public java.lang.String getModeloEtqAcomp(){
    return this.modeloEtqAcomp;
  }

  /**
   * Define modeloEtqAcomp
   * @param modeloEtqAcomp modeloEtqAcomp
   * @generated
   */
  public HyUnidsau setModeloEtqAcomp(java.lang.String modeloEtqAcomp){
    this.modeloEtqAcomp = modeloEtqAcomp;
    return this;
  }

  /**
   * Obtém modeloEtqPul
   * return modeloEtqPul
   * @generated
   */
  
  public java.lang.String getModeloEtqPul(){
    return this.modeloEtqPul;
  }

  /**
   * Define modeloEtqPul
   * @param modeloEtqPul modeloEtqPul
   * @generated
   */
  public HyUnidsau setModeloEtqPul(java.lang.String modeloEtqPul){
    this.modeloEtqPul = modeloEtqPul;
    return this;
  }

  /**
   * Obtém modeloFaa
   * return modeloFaa
   * @generated
   */
  
  public java.lang.String getModeloFaa(){
    return this.modeloFaa;
  }

  /**
   * Define modeloFaa
   * @param modeloFaa modeloFaa
   * @generated
   */
  public HyUnidsau setModeloFaa(java.lang.String modeloFaa){
    this.modeloFaa = modeloFaa;
    return this;
  }

  /**
   * Obtém modeloFaaPos
   * return modeloFaaPos
   * @generated
   */
  
  public java.lang.String getModeloFaaPos(){
    return this.modeloFaaPos;
  }

  /**
   * Define modeloFaaPos
   * @param modeloFaaPos modeloFaaPos
   * @generated
   */
  public HyUnidsau setModeloFaaPos(java.lang.String modeloFaaPos){
    this.modeloFaaPos = modeloFaaPos;
    return this;
  }

  /**
   * Obtém modeloGuiaEnc
   * return modeloGuiaEnc
   * @generated
   */
  
  public java.lang.String getModeloGuiaEnc(){
    return this.modeloGuiaEnc;
  }

  /**
   * Define modeloGuiaEnc
   * @param modeloGuiaEnc modeloGuiaEnc
   * @generated
   */
  public HyUnidsau setModeloGuiaEnc(java.lang.String modeloGuiaEnc){
    this.modeloGuiaEnc = modeloGuiaEnc;
    return this;
  }

  /**
   * Obtém modeloPacetiqueta
   * return modeloPacetiqueta
   * @generated
   */
  
  public java.lang.String getModeloPacetiqueta(){
    return this.modeloPacetiqueta;
  }

  /**
   * Define modeloPacetiqueta
   * @param modeloPacetiqueta modeloPacetiqueta
   * @generated
   */
  public HyUnidsau setModeloPacetiqueta(java.lang.String modeloPacetiqueta){
    this.modeloPacetiqueta = modeloPacetiqueta;
    return this;
  }

  /**
   * Obtém modeloProtexame
   * return modeloProtexame
   * @generated
   */
  
  public java.lang.String getModeloProtexame(){
    return this.modeloProtexame;
  }

  /**
   * Define modeloProtexame
   * @param modeloProtexame modeloProtexame
   * @generated
   */
  public HyUnidsau setModeloProtexame(java.lang.String modeloProtexame){
    this.modeloProtexame = modeloProtexame;
    return this;
  }

  /**
   * Obtém modeloProtguia
   * return modeloProtguia
   * @generated
   */
  
  public java.lang.String getModeloProtguia(){
    return this.modeloProtguia;
  }

  /**
   * Define modeloProtguia
   * @param modeloProtguia modeloProtguia
   * @generated
   */
  public HyUnidsau setModeloProtguia(java.lang.String modeloProtguia){
    this.modeloProtguia = modeloProtguia;
    return this;
  }

  /**
   * Obtém modeloReceita
   * return modeloReceita
   * @generated
   */
  
  public java.lang.String getModeloReceita(){
    return this.modeloReceita;
  }

  /**
   * Define modeloReceita
   * @param modeloReceita modeloReceita
   * @generated
   */
  public HyUnidsau setModeloReceita(java.lang.String modeloReceita){
    this.modeloReceita = modeloReceita;
    return this;
  }

  /**
   * Obtém modeloReceitalivre
   * return modeloReceitalivre
   * @generated
   */
  
  public java.lang.String getModeloReceitalivre(){
    return this.modeloReceitalivre;
  }

  /**
   * Define modeloReceitalivre
   * @param modeloReceitalivre modeloReceitalivre
   * @generated
   */
  public HyUnidsau setModeloReceitalivre(java.lang.String modeloReceitalivre){
    this.modeloReceitalivre = modeloReceitalivre;
    return this;
  }

  /**
   * Obtém modeloRecexame
   * return modeloRecexame
   * @generated
   */
  
  public java.lang.String getModeloRecexame(){
    return this.modeloRecexame;
  }

  /**
   * Define modeloRecexame
   * @param modeloRecexame modeloRecexame
   * @generated
   */
  public HyUnidsau setModeloRecexame(java.lang.String modeloRecexame){
    this.modeloRecexame = modeloRecexame;
    return this;
  }

  /**
   * Obtém modeloRecibo
   * return modeloRecibo
   * @generated
   */
  
  public java.lang.String getModeloRecibo(){
    return this.modeloRecibo;
  }

  /**
   * Define modeloRecibo
   * @param modeloRecibo modeloRecibo
   * @generated
   */
  public HyUnidsau setModeloRecibo(java.lang.String modeloRecibo){
    this.modeloRecibo = modeloRecibo;
    return this;
  }

  /**
   * Obtém modeloSolicintpos
   * return modeloSolicintpos
   * @generated
   */
  
  public java.lang.String getModeloSolicintpos(){
    return this.modeloSolicintpos;
  }

  /**
   * Define modeloSolicintpos
   * @param modeloSolicintpos modeloSolicintpos
   * @generated
   */
  public HyUnidsau setModeloSolicintpos(java.lang.String modeloSolicintpos){
    this.modeloSolicintpos = modeloSolicintpos;
    return this;
  }

  /**
   * Obtém modeloSolicintpre
   * return modeloSolicintpre
   * @generated
   */
  
  public java.lang.String getModeloSolicintpre(){
    return this.modeloSolicintpre;
  }

  /**
   * Define modeloSolicintpre
   * @param modeloSolicintpre modeloSolicintpre
   * @generated
   */
  public HyUnidsau setModeloSolicintpre(java.lang.String modeloSolicintpre){
    this.modeloSolicintpre = modeloSolicintpre;
    return this;
  }

  /**
   * Obtém mostraEndereco
   * return mostraEndereco
   * @generated
   */
  
  public java.lang.String getMostraEndereco(){
    return this.mostraEndereco;
  }

  /**
   * Define mostraEndereco
   * @param mostraEndereco mostraEndereco
   * @generated
   */
  public HyUnidsau setMostraEndereco(java.lang.String mostraEndereco){
    this.mostraEndereco = mostraEndereco;
    return this;
  }

  /**
   * Obtém mostraInfotriagem
   * return mostraInfotriagem
   * @generated
   */
  
  public java.lang.String getMostraInfotriagem(){
    return this.mostraInfotriagem;
  }

  /**
   * Define mostraInfotriagem
   * @param mostraInfotriagem mostraInfotriagem
   * @generated
   */
  public HyUnidsau setMostraInfotriagem(java.lang.String mostraInfotriagem){
    this.mostraInfotriagem = mostraInfotriagem;
    return this;
  }

  /**
   * Obtém mostraProfreqint
   * return mostraProfreqint
   * @generated
   */
  
  public java.lang.String getMostraProfreqint(){
    return this.mostraProfreqint;
  }

  /**
   * Define mostraProfreqint
   * @param mostraProfreqint mostraProfreqint
   * @generated
   */
  public HyUnidsau setMostraProfreqint(java.lang.String mostraProfreqint){
    this.mostraProfreqint = mostraProfreqint;
    return this;
  }

  /**
   * Obtém mostraUsuAgdado
   * return mostraUsuAgdado
   * @generated
   */
  
  public java.lang.String getMostraUsuAgdado(){
    return this.mostraUsuAgdado;
  }

  /**
   * Define mostraUsuAgdado
   * @param mostraUsuAgdado mostraUsuAgdado
   * @generated
   */
  public HyUnidsau setMostraUsuAgdado(java.lang.String mostraUsuAgdado){
    this.mostraUsuAgdado = mostraUsuAgdado;
    return this;
  }

  /**
   * Obtém mostracnsAtend
   * return mostracnsAtend
   * @generated
   */
  
  public java.lang.String getMostracnsAtend(){
    return this.mostracnsAtend;
  }

  /**
   * Define mostracnsAtend
   * @param mostracnsAtend mostracnsAtend
   * @generated
   */
  public HyUnidsau setMostracnsAtend(java.lang.String mostracnsAtend){
    this.mostracnsAtend = mostracnsAtend;
    return this;
  }

  /**
   * Obtém mostracnsPacag
   * return mostracnsPacag
   * @generated
   */
  
  public java.lang.String getMostracnsPacag(){
    return this.mostracnsPacag;
  }

  /**
   * Define mostracnsPacag
   * @param mostracnsPacag mostracnsPacag
   * @generated
   */
  public HyUnidsau setMostracnsPacag(java.lang.String mostracnsPacag){
    this.mostracnsPacag = mostracnsPacag;
    return this;
  }

  /**
   * Obtém mostraconfPacag
   * return mostraconfPacag
   * @generated
   */
  
  public java.lang.String getMostraconfPacag(){
    return this.mostraconfPacag;
  }

  /**
   * Define mostraconfPacag
   * @param mostraconfPacag mostraconfPacag
   * @generated
   */
  public HyUnidsau setMostraconfPacag(java.lang.String mostraconfPacag){
    this.mostraconfPacag = mostraconfPacag;
    return this;
  }

  /**
   * Obtém mostradatanascAtend
   * return mostradatanascAtend
   * @generated
   */
  
  public java.lang.String getMostradatanascAtend(){
    return this.mostradatanascAtend;
  }

  /**
   * Define mostradatanascAtend
   * @param mostradatanascAtend mostradatanascAtend
   * @generated
   */
  public HyUnidsau setMostradatanascAtend(java.lang.String mostradatanascAtend){
    this.mostradatanascAtend = mostradatanascAtend;
    return this;
  }

  /**
   * Obtém mostradiaPacag
   * return mostradiaPacag
   * @generated
   */
  
  public java.lang.String getMostradiaPacag(){
    return this.mostradiaPacag;
  }

  /**
   * Define mostradiaPacag
   * @param mostradiaPacag mostradiaPacag
   * @generated
   */
  public HyUnidsau setMostradiaPacag(java.lang.String mostradiaPacag){
    this.mostradiaPacag = mostradiaPacag;
    return this;
  }

  /**
   * Obtém mostradiaPacagus
   * return mostradiaPacagus
   * @generated
   */
  
  public java.lang.String getMostradiaPacagus(){
    return this.mostradiaPacagus;
  }

  /**
   * Define mostradiaPacagus
   * @param mostradiaPacagus mostradiaPacagus
   * @generated
   */
  public HyUnidsau setMostradiaPacagus(java.lang.String mostradiaPacagus){
    this.mostradiaPacagus = mostradiaPacagus;
    return this;
  }

  /**
   * Obtém mostradiaPacex
   * return mostradiaPacex
   * @generated
   */
  
  public java.lang.String getMostradiaPacex(){
    return this.mostradiaPacex;
  }

  /**
   * Define mostradiaPacex
   * @param mostradiaPacex mostradiaPacex
   * @generated
   */
  public HyUnidsau setMostradiaPacex(java.lang.String mostradiaPacex){
    this.mostradiaPacex = mostradiaPacex;
    return this;
  }

  /**
   * Obtém mostradiaPacexus
   * return mostradiaPacexus
   * @generated
   */
  
  public java.lang.String getMostradiaPacexus(){
    return this.mostradiaPacexus;
  }

  /**
   * Define mostradiaPacexus
   * @param mostradiaPacexus mostradiaPacexus
   * @generated
   */
  public HyUnidsau setMostradiaPacexus(java.lang.String mostradiaPacexus){
    this.mostradiaPacexus = mostradiaPacexus;
    return this;
  }

  /**
   * Obtém mostrafamiliaPacag
   * return mostrafamiliaPacag
   * @generated
   */
  
  public java.lang.String getMostrafamiliaPacag(){
    return this.mostrafamiliaPacag;
  }

  /**
   * Define mostrafamiliaPacag
   * @param mostrafamiliaPacag mostrafamiliaPacag
   * @generated
   */
  public HyUnidsau setMostrafamiliaPacag(java.lang.String mostrafamiliaPacag){
    this.mostrafamiliaPacag = mostrafamiliaPacag;
    return this;
  }

  /**
   * Obtém mostrafonePacag
   * return mostrafonePacag
   * @generated
   */
  
  public java.lang.String getMostrafonePacag(){
    return this.mostrafonePacag;
  }

  /**
   * Define mostrafonePacag
   * @param mostrafonePacag mostrafonePacag
   * @generated
   */
  public HyUnidsau setMostrafonePacag(java.lang.String mostrafonePacag){
    this.mostrafonePacag = mostrafonePacag;
    return this;
  }

  /**
   * Obtém mostragrupoPacag
   * return mostragrupoPacag
   * @generated
   */
  
  public java.lang.String getMostragrupoPacag(){
    return this.mostragrupoPacag;
  }

  /**
   * Define mostragrupoPacag
   * @param mostragrupoPacag mostragrupoPacag
   * @generated
   */
  public HyUnidsau setMostragrupoPacag(java.lang.String mostragrupoPacag){
    this.mostragrupoPacag = mostragrupoPacag;
    return this;
  }

  /**
   * Obtém mostragrupoPacagus
   * return mostragrupoPacagus
   * @generated
   */
  
  public java.lang.String getMostragrupoPacagus(){
    return this.mostragrupoPacagus;
  }

  /**
   * Define mostragrupoPacagus
   * @param mostragrupoPacagus mostragrupoPacagus
   * @generated
   */
  public HyUnidsau setMostragrupoPacagus(java.lang.String mostragrupoPacagus){
    this.mostragrupoPacagus = mostragrupoPacagus;
    return this;
  }

  /**
   * Obtém mostragrupoPacex
   * return mostragrupoPacex
   * @generated
   */
  
  public java.lang.String getMostragrupoPacex(){
    return this.mostragrupoPacex;
  }

  /**
   * Define mostragrupoPacex
   * @param mostragrupoPacex mostragrupoPacex
   * @generated
   */
  public HyUnidsau setMostragrupoPacex(java.lang.String mostragrupoPacex){
    this.mostragrupoPacex = mostragrupoPacex;
    return this;
  }

  /**
   * Obtém mostragrupoPacexus
   * return mostragrupoPacexus
   * @generated
   */
  
  public java.lang.String getMostragrupoPacexus(){
    return this.mostragrupoPacexus;
  }

  /**
   * Define mostragrupoPacexus
   * @param mostragrupoPacexus mostragrupoPacexus
   * @generated
   */
  public HyUnidsau setMostragrupoPacexus(java.lang.String mostragrupoPacexus){
    this.mostragrupoPacexus = mostragrupoPacexus;
    return this;
  }

  /**
   * Obtém mostraidadePacag
   * return mostraidadePacag
   * @generated
   */
  
  public java.lang.String getMostraidadePacag(){
    return this.mostraidadePacag;
  }

  /**
   * Define mostraidadePacag
   * @param mostraidadePacag mostraidadePacag
   * @generated
   */
  public HyUnidsau setMostraidadePacag(java.lang.String mostraidadePacag){
    this.mostraidadePacag = mostraidadePacag;
    return this;
  }

  /**
   * Obtém mostraidadePacagus
   * return mostraidadePacagus
   * @generated
   */
  
  public java.lang.String getMostraidadePacagus(){
    return this.mostraidadePacagus;
  }

  /**
   * Define mostraidadePacagus
   * @param mostraidadePacagus mostraidadePacagus
   * @generated
   */
  public HyUnidsau setMostraidadePacagus(java.lang.String mostraidadePacagus){
    this.mostraidadePacagus = mostraidadePacagus;
    return this;
  }

  /**
   * Obtém mostraidadePacex
   * return mostraidadePacex
   * @generated
   */
  
  public java.lang.String getMostraidadePacex(){
    return this.mostraidadePacex;
  }

  /**
   * Define mostraidadePacex
   * @param mostraidadePacex mostraidadePacex
   * @generated
   */
  public HyUnidsau setMostraidadePacex(java.lang.String mostraidadePacex){
    this.mostraidadePacex = mostraidadePacex;
    return this;
  }

  /**
   * Obtém mostraidadePacexus
   * return mostraidadePacexus
   * @generated
   */
  
  public java.lang.String getMostraidadePacexus(){
    return this.mostraidadePacexus;
  }

  /**
   * Define mostraidadePacexus
   * @param mostraidadePacexus mostraidadePacexus
   * @generated
   */
  public HyUnidsau setMostraidadePacexus(java.lang.String mostraidadePacexus){
    this.mostraidadePacexus = mostraidadePacexus;
    return this;
  }

  /**
   * Obtém mostranumpacPacag
   * return mostranumpacPacag
   * @generated
   */
  
  public java.lang.String getMostranumpacPacag(){
    return this.mostranumpacPacag;
  }

  /**
   * Define mostranumpacPacag
   * @param mostranumpacPacag mostranumpacPacag
   * @generated
   */
  public HyUnidsau setMostranumpacPacag(java.lang.String mostranumpacPacag){
    this.mostranumpacPacag = mostranumpacPacag;
    return this;
  }

  /**
   * Obtém mostrapedecartaoPacag
   * return mostrapedecartaoPacag
   * @generated
   */
  
  public java.lang.String getMostrapedecartaoPacag(){
    return this.mostrapedecartaoPacag;
  }

  /**
   * Define mostrapedecartaoPacag
   * @param mostrapedecartaoPacag mostrapedecartaoPacag
   * @generated
   */
  public HyUnidsau setMostrapedecartaoPacag(java.lang.String mostrapedecartaoPacag){
    this.mostrapedecartaoPacag = mostrapedecartaoPacag;
    return this;
  }

  /**
   * Obtém mostrapossuicartaoPacag
   * return mostrapossuicartaoPacag
   * @generated
   */
  
  public java.lang.String getMostrapossuicartaoPacag(){
    return this.mostrapossuicartaoPacag;
  }

  /**
   * Define mostrapossuicartaoPacag
   * @param mostrapossuicartaoPacag mostrapossuicartaoPacag
   * @generated
   */
  public HyUnidsau setMostrapossuicartaoPacag(java.lang.String mostrapossuicartaoPacag){
    this.mostrapossuicartaoPacag = mostrapossuicartaoPacag;
    return this;
  }

  /**
   * Obtém mostrapreconAtend
   * return mostrapreconAtend
   * @generated
   */
  
  public java.lang.String getMostrapreconAtend(){
    return this.mostrapreconAtend;
  }

  /**
   * Define mostrapreconAtend
   * @param mostrapreconAtend mostrapreconAtend
   * @generated
   */
  public HyUnidsau setMostrapreconAtend(java.lang.String mostrapreconAtend){
    this.mostrapreconAtend = mostrapreconAtend;
    return this;
  }

  /**
   * Obtém mostrasexoAtend
   * return mostrasexoAtend
   * @generated
   */
  
  public java.lang.String getMostrasexoAtend(){
    return this.mostrasexoAtend;
  }

  /**
   * Define mostrasexoAtend
   * @param mostrasexoAtend mostrasexoAtend
   * @generated
   */
  public HyUnidsau setMostrasexoAtend(java.lang.String mostrasexoAtend){
    this.mostrasexoAtend = mostrasexoAtend;
    return this;
  }

  /**
   * Obtém mostrausreqPacag
   * return mostrausreqPacag
   * @generated
   */
  
  public java.lang.String getMostrausreqPacag(){
    return this.mostrausreqPacag;
  }

  /**
   * Define mostrausreqPacag
   * @param mostrausreqPacag mostrausreqPacag
   * @generated
   */
  public HyUnidsau setMostrausreqPacag(java.lang.String mostrausreqPacag){
    this.mostrausreqPacag = mostrausreqPacag;
    return this;
  }

  /**
   * Obtém motivcancelint
   * return motivcancelint
   * @generated
   */
  
  public java.lang.String getMotivcancelint(){
    return this.motivcancelint;
  }

  /**
   * Define motivcancelint
   * @param motivcancelint motivcancelint
   * @generated
   */
  public HyUnidsau setMotivcancelint(java.lang.String motivcancelint){
    this.motivcancelint = motivcancelint;
    return this;
  }

  /**
   * Obtém motivoCancelSolleitoupa
   * return motivoCancelSolleitoupa
   * @generated
   */
  
  public java.lang.String getMotivoCancelSolleitoupa(){
    return this.motivoCancelSolleitoupa;
  }

  /**
   * Define motivoCancelSolleitoupa
   * @param motivoCancelSolleitoupa motivoCancelSolleitoupa
   * @generated
   */
  public HyUnidsau setMotivoCancelSolleitoupa(java.lang.String motivoCancelSolleitoupa){
    this.motivoCancelSolleitoupa = motivoCancelSolleitoupa;
    return this;
  }

  /**
   * Obtém msgFaa
   * return msgFaa
   * @generated
   */
  
  public java.lang.String getMsgFaa(){
    return this.msgFaa;
  }

  /**
   * Define msgFaa
   * @param msgFaa msgFaa
   * @generated
   */
  public HyUnidsau setMsgFaa(java.lang.String msgFaa){
    this.msgFaa = msgFaa;
    return this;
  }

  /**
   * Obtém msgrecibo
   * return msgrecibo
   * @generated
   */
  
  public java.lang.String getMsgrecibo(){
    return this.msgrecibo;
  }

  /**
   * Define msgrecibo
   * @param msgrecibo msgrecibo
   * @generated
   */
  public HyUnidsau setMsgrecibo(java.lang.String msgrecibo){
    this.msgrecibo = msgrecibo;
    return this;
  }

  /**
   * Obtém naoCtrlAgd
   * return naoCtrlAgd
   * @generated
   */
  
  public java.lang.String getNaoCtrlAgd(){
    return this.naoCtrlAgd;
  }

  /**
   * Define naoCtrlAgd
   * @param naoCtrlAgd naoCtrlAgd
   * @generated
   */
  public HyUnidsau setNaoCtrlAgd(java.lang.String naoCtrlAgd){
    this.naoCtrlAgd = naoCtrlAgd;
    return this;
  }

  /**
   * Obtém naoCtrlLeito
   * return naoCtrlLeito
   * @generated
   */
  
  public java.lang.String getNaoCtrlLeito(){
    return this.naoCtrlLeito;
  }

  /**
   * Define naoCtrlLeito
   * @param naoCtrlLeito naoCtrlLeito
   * @generated
   */
  public HyUnidsau setNaoCtrlLeito(java.lang.String naoCtrlLeito){
    this.naoCtrlLeito = naoCtrlLeito;
    return this;
  }

  /**
   * Obtém naoEncEmRegexpres
   * return naoEncEmRegexpres
   * @generated
   */
  
  public java.lang.String getNaoEncEmRegexpres(){
    return this.naoEncEmRegexpres;
  }

  /**
   * Define naoEncEmRegexpres
   * @param naoEncEmRegexpres naoEncEmRegexpres
   * @generated
   */
  public HyUnidsau setNaoEncEmRegexpres(java.lang.String naoEncEmRegexpres){
    this.naoEncEmRegexpres = naoEncEmRegexpres;
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
  public HyUnidsau setNome(java.lang.String nome){
    this.nome = nome;
    return this;
  }

  /**
   * Obtém notifDengueMargEsq
   * return notifDengueMargEsq
   * @generated
   */
  
  public java.lang.Integer getNotifDengueMargEsq(){
    return this.notifDengueMargEsq;
  }

  /**
   * Define notifDengueMargEsq
   * @param notifDengueMargEsq notifDengueMargEsq
   * @generated
   */
  public HyUnidsau setNotifDengueMargEsq(java.lang.Integer notifDengueMargEsq){
    this.notifDengueMargEsq = notifDengueMargEsq;
    return this;
  }

  /**
   * Obtém notifDengueMargSup
   * return notifDengueMargSup
   * @generated
   */
  
  public java.lang.Integer getNotifDengueMargSup(){
    return this.notifDengueMargSup;
  }

  /**
   * Define notifDengueMargSup
   * @param notifDengueMargSup notifDengueMargSup
   * @generated
   */
  public HyUnidsau setNotifDengueMargSup(java.lang.Integer notifDengueMargSup){
    this.notifDengueMargSup = notifDengueMargSup;
    return this;
  }

  /**
   * Obtém notifDengueTipo
   * return notifDengueTipo
   * @generated
   */
  
  public java.lang.Integer getNotifDengueTipo(){
    return this.notifDengueTipo;
  }

  /**
   * Define notifDengueTipo
   * @param notifDengueTipo notifDengueTipo
   * @generated
   */
  public HyUnidsau setNotifDengueTipo(java.lang.Integer notifDengueTipo){
    this.notifDengueTipo = notifDengueTipo;
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
  public HyUnidsau setNumeroend(java.lang.String numeroend){
    this.numeroend = numeroend;
    return this;
  }

  /**
   * Obtém obrigaClasRisco
   * return obrigaClasRisco
   * @generated
   */
  
  public java.lang.String getObrigaClasRisco(){
    return this.obrigaClasRisco;
  }

  /**
   * Define obrigaClasRisco
   * @param obrigaClasRisco obrigaClasRisco
   * @generated
   */
  public HyUnidsau setObrigaClasRisco(java.lang.String obrigaClasRisco){
    this.obrigaClasRisco = obrigaClasRisco;
    return this;
  }

  /**
   * Obtém obrigaProfRecep
   * return obrigaProfRecep
   * @generated
   */
  
  public java.lang.String getObrigaProfRecep(){
    return this.obrigaProfRecep;
  }

  /**
   * Define obrigaProfRecep
   * @param obrigaProfRecep obrigaProfRecep
   * @generated
   */
  public HyUnidsau setObrigaProfRecep(java.lang.String obrigaProfRecep){
    this.obrigaProfRecep = obrigaProfRecep;
    return this;
  }

  /**
   * Obtém obrigasenha
   * return obrigasenha
   * @generated
   */
  
  public java.lang.String getObrigasenha(){
    return this.obrigasenha;
  }

  /**
   * Define obrigasenha
   * @param obrigasenha obrigasenha
   * @generated
   */
  public HyUnidsau setObrigasenha(java.lang.String obrigasenha){
    this.obrigasenha = obrigasenha;
    return this;
  }

  /**
   * Obtém obsparaint
   * return obsparaint
   * @generated
   */
  
  public java.lang.String getObsparaint(){
    return this.obsparaint;
  }

  /**
   * Define obsparaint
   * @param obsparaint obsparaint
   * @generated
   */
  public HyUnidsau setObsparaint(java.lang.String obsparaint){
    this.obsparaint = obsparaint;
    return this;
  }

  /**
   * Obtém padMedAtend
   * return padMedAtend
   * @generated
   */
  
  public java.lang.String getPadMedAtend(){
    return this.padMedAtend;
  }

  /**
   * Define padMedAtend
   * @param padMedAtend padMedAtend
   * @generated
   */
  public HyUnidsau setPadMedAtend(java.lang.String padMedAtend){
    this.padMedAtend = padMedAtend;
    return this;
  }

  /**
   * Obtém prazoAltLc
   * return prazoAltLc
   * @generated
   */
  
  public java.lang.Integer getPrazoAltLc(){
    return this.prazoAltLc;
  }

  /**
   * Define prazoAltLc
   * @param prazoAltLc prazoAltLc
   * @generated
   */
  public HyUnidsau setPrazoAltLc(java.lang.Integer prazoAltLc){
    this.prazoAltLc = prazoAltLc;
    return this;
  }

  /**
   * Obtém prazochamada
   * return prazochamada
   * @generated
   */
  
  public java.lang.Integer getPrazochamada(){
    return this.prazochamada;
  }

  /**
   * Define prazochamada
   * @param prazochamada prazochamada
   * @generated
   */
  public HyUnidsau setPrazochamada(java.lang.Integer prazochamada){
    this.prazochamada = prazochamada;
    return this;
  }

  /**
   * Obtém prazocota
   * return prazocota
   * @generated
   */
  
  public java.lang.Integer getPrazocota(){
    return this.prazocota;
  }

  /**
   * Define prazocota
   * @param prazocota prazocota
   * @generated
   */
  public HyUnidsau setPrazocota(java.lang.Integer prazocota){
    this.prazocota = prazocota;
    return this;
  }

  /**
   * Obtém prazoretorno
   * return prazoretorno
   * @generated
   */
  
  public java.lang.Integer getPrazoretorno(){
    return this.prazoretorno;
  }

  /**
   * Define prazoretorno
   * @param prazoretorno prazoretorno
   * @generated
   */
  public HyUnidsau setPrazoretorno(java.lang.Integer prazoretorno){
    this.prazoretorno = prazoretorno;
    return this;
  }

  /**
   * Obtém preconEmPrescmed
   * return preconEmPrescmed
   * @generated
   */
  
  public java.lang.String getPreconEmPrescmed(){
    return this.preconEmPrescmed;
  }

  /**
   * Define preconEmPrescmed
   * @param preconEmPrescmed preconEmPrescmed
   * @generated
   */
  public HyUnidsau setPreconEmPrescmed(java.lang.String preconEmPrescmed){
    this.preconEmPrescmed = preconEmPrescmed;
    return this;
  }

  /**
   * Obtém preconsCintura
   * return preconsCintura
   * @generated
   */
  
  public java.lang.String getPreconsCintura(){
    return this.preconsCintura;
  }

  /**
   * Define preconsCintura
   * @param preconsCintura preconsCintura
   * @generated
   */
  public HyUnidsau setPreconsCintura(java.lang.String preconsCintura){
    this.preconsCintura = preconsCintura;
    return this;
  }

  /**
   * Obtém preconsEstatura
   * return preconsEstatura
   * @generated
   */
  
  public java.lang.String getPreconsEstatura(){
    return this.preconsEstatura;
  }

  /**
   * Define preconsEstatura
   * @param preconsEstatura preconsEstatura
   * @generated
   */
  public HyUnidsau setPreconsEstatura(java.lang.String preconsEstatura){
    this.preconsEstatura = preconsEstatura;
    return this;
  }

  /**
   * Obtém preconsFicha
   * return preconsFicha
   * @generated
   */
  
  public java.lang.String getPreconsFicha(){
    return this.preconsFicha;
  }

  /**
   * Define preconsFicha
   * @param preconsFicha preconsFicha
   * @generated
   */
  public HyUnidsau setPreconsFicha(java.lang.String preconsFicha){
    this.preconsFicha = preconsFicha;
    return this;
  }

  /**
   * Obtém preconsFreqResp
   * return preconsFreqResp
   * @generated
   */
  
  public java.lang.String getPreconsFreqResp(){
    return this.preconsFreqResp;
  }

  /**
   * Define preconsFreqResp
   * @param preconsFreqResp preconsFreqResp
   * @generated
   */
  public HyUnidsau setPreconsFreqResp(java.lang.String preconsFreqResp){
    this.preconsFreqResp = preconsFreqResp;
    return this;
  }

  /**
   * Obtém preconsGliJejum
   * return preconsGliJejum
   * @generated
   */
  
  public java.lang.String getPreconsGliJejum(){
    return this.preconsGliJejum;
  }

  /**
   * Define preconsGliJejum
   * @param preconsGliJejum preconsGliJejum
   * @generated
   */
  public HyUnidsau setPreconsGliJejum(java.lang.String preconsGliJejum){
    this.preconsGliJejum = preconsGliJejum;
    return this;
  }

  /**
   * Obtém preconsGliPospran
   * return preconsGliPospran
   * @generated
   */
  
  public java.lang.String getPreconsGliPospran(){
    return this.preconsGliPospran;
  }

  /**
   * Define preconsGliPospran
   * @param preconsGliPospran preconsGliPospran
   * @generated
   */
  public HyUnidsau setPreconsGliPospran(java.lang.String preconsGliPospran){
    this.preconsGliPospran = preconsGliPospran;
    return this;
  }

  /**
   * Obtém preconsImc
   * return preconsImc
   * @generated
   */
  
  public java.lang.String getPreconsImc(){
    return this.preconsImc;
  }

  /**
   * Define preconsImc
   * @param preconsImc preconsImc
   * @generated
   */
  public HyUnidsau setPreconsImc(java.lang.String preconsImc){
    this.preconsImc = preconsImc;
    return this;
  }

  /**
   * Obtém preconsPadiast
   * return preconsPadiast
   * @generated
   */
  
  public java.lang.String getPreconsPadiast(){
    return this.preconsPadiast;
  }

  /**
   * Define preconsPadiast
   * @param preconsPadiast preconsPadiast
   * @generated
   */
  public HyUnidsau setPreconsPadiast(java.lang.String preconsPadiast){
    this.preconsPadiast = preconsPadiast;
    return this;
  }

  /**
   * Obtém preconsPasist
   * return preconsPasist
   * @generated
   */
  
  public java.lang.String getPreconsPasist(){
    return this.preconsPasist;
  }

  /**
   * Define preconsPasist
   * @param preconsPasist preconsPasist
   * @generated
   */
  public HyUnidsau setPreconsPasist(java.lang.String preconsPasist){
    this.preconsPasist = preconsPasist;
    return this;
  }

  /**
   * Obtém preconsPerCef
   * return preconsPerCef
   * @generated
   */
  
  public java.lang.String getPreconsPerCef(){
    return this.preconsPerCef;
  }

  /**
   * Define preconsPerCef
   * @param preconsPerCef preconsPerCef
   * @generated
   */
  public HyUnidsau setPreconsPerCef(java.lang.String preconsPerCef){
    this.preconsPerCef = preconsPerCef;
    return this;
  }

  /**
   * Obtém preconsPeso
   * return preconsPeso
   * @generated
   */
  
  public java.lang.String getPreconsPeso(){
    return this.preconsPeso;
  }

  /**
   * Define preconsPeso
   * @param preconsPeso preconsPeso
   * @generated
   */
  public HyUnidsau setPreconsPeso(java.lang.String preconsPeso){
    this.preconsPeso = preconsPeso;
    return this;
  }

  /**
   * Obtém preconsPulso
   * return preconsPulso
   * @generated
   */
  
  public java.lang.String getPreconsPulso(){
    return this.preconsPulso;
  }

  /**
   * Define preconsPulso
   * @param preconsPulso preconsPulso
   * @generated
   */
  public HyUnidsau setPreconsPulso(java.lang.String preconsPulso){
    this.preconsPulso = preconsPulso;
    return this;
  }

  /**
   * Obtém preconsSatO2
   * return preconsSatO2
   * @generated
   */
  
  public java.lang.String getPreconsSatO2(){
    return this.preconsSatO2;
  }

  /**
   * Define preconsSatO2
   * @param preconsSatO2 preconsSatO2
   * @generated
   */
  public HyUnidsau setPreconsSatO2(java.lang.String preconsSatO2){
    this.preconsSatO2 = preconsSatO2;
    return this;
  }

  /**
   * Obtém preconsTemp
   * return preconsTemp
   * @generated
   */
  
  public java.lang.String getPreconsTemp(){
    return this.preconsTemp;
  }

  /**
   * Define preconsTemp
   * @param preconsTemp preconsTemp
   * @generated
   */
  public HyUnidsau setPreconsTemp(java.lang.String preconsTemp){
    this.preconsTemp = preconsTemp;
    return this;
  }

  /**
   * Obtém preencheMicroarea
   * return preencheMicroarea
   * @generated
   */
  
  public java.lang.String getPreencheMicroarea(){
    return this.preencheMicroarea;
  }

  /**
   * Define preencheMicroarea
   * @param preencheMicroarea preencheMicroarea
   * @generated
   */
  public HyUnidsau setPreencheMicroarea(java.lang.String preencheMicroarea){
    this.preencheMicroarea = preencheMicroarea;
    return this;
  }

  /**
   * Obtém prioridFarma
   * return prioridFarma
   * @generated
   */
  
  public java.lang.String getPrioridFarma(){
    return this.prioridFarma;
  }

  /**
   * Define prioridFarma
   * @param prioridFarma prioridFarma
   * @generated
   */
  public HyUnidsau setPrioridFarma(java.lang.String prioridFarma){
    this.prioridFarma = prioridFarma;
    return this;
  }

  /**
   * Obtém procedAt
   * return procedAt
   * @generated
   */
  
  public java.lang.String getProcedAt(){
    return this.procedAt;
  }

  /**
   * Define procedAt
   * @param procedAt procedAt
   * @generated
   */
  public HyUnidsau setProcedAt(java.lang.String procedAt){
    this.procedAt = procedAt;
    return this;
  }

  /**
   * Obtém procedColeta
   * return procedColeta
   * @generated
   */
  
  public java.lang.String getProcedColeta(){
    return this.procedColeta;
  }

  /**
   * Define procedColeta
   * @param procedColeta procedColeta
   * @generated
   */
  public HyUnidsau setProcedColeta(java.lang.String procedColeta){
    this.procedColeta = procedColeta;
    return this;
  }

  /**
   * Obtém procedMed
   * return procedMed
   * @generated
   */
  
  public java.lang.String getProcedMed(){
    return this.procedMed;
  }

  /**
   * Define procedMed
   * @param procedMed procedMed
   * @generated
   */
  public HyUnidsau setProcedMed(java.lang.String procedMed){
    this.procedMed = procedMed;
    return this;
  }

  /**
   * Obtém protexamMargEsq
   * return protexamMargEsq
   * @generated
   */
  
  public java.lang.Integer getProtexamMargEsq(){
    return this.protexamMargEsq;
  }

  /**
   * Define protexamMargEsq
   * @param protexamMargEsq protexamMargEsq
   * @generated
   */
  public HyUnidsau setProtexamMargEsq(java.lang.Integer protexamMargEsq){
    this.protexamMargEsq = protexamMargEsq;
    return this;
  }

  /**
   * Obtém protexamMargSup
   * return protexamMargSup
   * @generated
   */
  
  public java.lang.Integer getProtexamMargSup(){
    return this.protexamMargSup;
  }

  /**
   * Define protexamMargSup
   * @param protexamMargSup protexamMargSup
   * @generated
   */
  public HyUnidsau setProtexamMargSup(java.lang.Integer protexamMargSup){
    this.protexamMargSup = protexamMargSup;
    return this;
  }

  /**
   * Obtém protguiaMargEsq
   * return protguiaMargEsq
   * @generated
   */
  
  public java.lang.Integer getProtguiaMargEsq(){
    return this.protguiaMargEsq;
  }

  /**
   * Define protguiaMargEsq
   * @param protguiaMargEsq protguiaMargEsq
   * @generated
   */
  public HyUnidsau setProtguiaMargEsq(java.lang.Integer protguiaMargEsq){
    this.protguiaMargEsq = protguiaMargEsq;
    return this;
  }

  /**
   * Obtém protguiaMargSup
   * return protguiaMargSup
   * @generated
   */
  
  public java.lang.Integer getProtguiaMargSup(){
    return this.protguiaMargSup;
  }

  /**
   * Define protguiaMargSup
   * @param protguiaMargSup protguiaMargSup
   * @generated
   */
  public HyUnidsau setProtguiaMargSup(java.lang.Integer protguiaMargSup){
    this.protguiaMargSup = protguiaMargSup;
    return this;
  }

  /**
   * Obtém razaoSocial
   * return razaoSocial
   * @generated
   */
  
  public java.lang.String getRazaoSocial(){
    return this.razaoSocial;
  }

  /**
   * Define razaoSocial
   * @param razaoSocial razaoSocial
   * @generated
   */
  public HyUnidsau setRazaoSocial(java.lang.String razaoSocial){
    this.razaoSocial = razaoSocial;
    return this;
  }

  /**
   * Obtém receitaMargEsq
   * return receitaMargEsq
   * @generated
   */
  
  public java.lang.Integer getReceitaMargEsq(){
    return this.receitaMargEsq;
  }

  /**
   * Define receitaMargEsq
   * @param receitaMargEsq receitaMargEsq
   * @generated
   */
  public HyUnidsau setReceitaMargEsq(java.lang.Integer receitaMargEsq){
    this.receitaMargEsq = receitaMargEsq;
    return this;
  }

  /**
   * Obtém receitaMargSup
   * return receitaMargSup
   * @generated
   */
  
  public java.lang.Integer getReceitaMargSup(){
    return this.receitaMargSup;
  }

  /**
   * Define receitaMargSup
   * @param receitaMargSup receitaMargSup
   * @generated
   */
  public HyUnidsau setReceitaMargSup(java.lang.Integer receitaMargSup){
    this.receitaMargSup = receitaMargSup;
    return this;
  }

  /**
   * Obtém recepsenha
   * return recepsenha
   * @generated
   */
  
  public java.lang.String getRecepsenha(){
    return this.recepsenha;
  }

  /**
   * Define recepsenha
   * @param recepsenha recepsenha
   * @generated
   */
  public HyUnidsau setRecepsenha(java.lang.String recepsenha){
    this.recepsenha = recepsenha;
    return this;
  }

  /**
   * Obtém relatreqexame
   * return relatreqexame
   * @generated
   */
  
  public java.lang.String getRelatreqexame(){
    return this.relatreqexame;
  }

  /**
   * Define relatreqexame
   * @param relatreqexame relatreqexame
   * @generated
   */
  public HyUnidsau setRelatreqexame(java.lang.String relatreqexame){
    this.relatreqexame = relatreqexame;
    return this;
  }

  /**
   * Obtém reqexamMargEsq
   * return reqexamMargEsq
   * @generated
   */
  
  public java.lang.Integer getReqexamMargEsq(){
    return this.reqexamMargEsq;
  }

  /**
   * Define reqexamMargEsq
   * @param reqexamMargEsq reqexamMargEsq
   * @generated
   */
  public HyUnidsau setReqexamMargEsq(java.lang.Integer reqexamMargEsq){
    this.reqexamMargEsq = reqexamMargEsq;
    return this;
  }

  /**
   * Obtém reqexamMargSup
   * return reqexamMargSup
   * @generated
   */
  
  public java.lang.Integer getReqexamMargSup(){
    return this.reqexamMargSup;
  }

  /**
   * Define reqexamMargSup
   * @param reqexamMargSup reqexamMargSup
   * @generated
   */
  public HyUnidsau setReqexamMargSup(java.lang.Integer reqexamMargSup){
    this.reqexamMargSup = reqexamMargSup;
    return this;
  }

  /**
   * Obtém resolucaoPadrao
   * return resolucaoPadrao
   * @generated
   */
  
  public java.lang.String getResolucaoPadrao(){
    return this.resolucaoPadrao;
  }

  /**
   * Define resolucaoPadrao
   * @param resolucaoPadrao resolucaoPadrao
   * @generated
   */
  public HyUnidsau setResolucaoPadrao(java.lang.String resolucaoPadrao){
    this.resolucaoPadrao = resolucaoPadrao;
    return this;
  }

  /**
   * Obtém respeitaEscala
   * return respeitaEscala
   * @generated
   */
  
  public java.lang.String getRespeitaEscala(){
    return this.respeitaEscala;
  }

  /**
   * Define respeitaEscala
   * @param respeitaEscala respeitaEscala
   * @generated
   */
  public HyUnidsau setRespeitaEscala(java.lang.String respeitaEscala){
    this.respeitaEscala = respeitaEscala;
    return this;
  }

  /**
   * Obtém respons
   * return respons
   * @generated
   */
  
  public java.lang.String getRespons(){
    return this.respons;
  }

  /**
   * Define respons
   * @param respons respons
   * @generated
   */
  public HyUnidsau setRespons(java.lang.String respons){
    this.respons = respons;
    return this;
  }

  /**
   * Obtém restrAgExUs
   * return restrAgExUs
   * @generated
   */
  
  public java.lang.String getRestrAgExUs(){
    return this.restrAgExUs;
  }

  /**
   * Define restrAgExUs
   * @param restrAgExUs restrAgExUs
   * @generated
   */
  public HyUnidsau setRestrAgExUs(java.lang.String restrAgExUs){
    this.restrAgExUs = restrAgExUs;
    return this;
  }

  /**
   * Obtém restringeLoteAplicvac
   * return restringeLoteAplicvac
   * @generated
   */
  
  public java.lang.String getRestringeLoteAplicvac(){
    return this.restringeLoteAplicvac;
  }

  /**
   * Define restringeLoteAplicvac
   * @param restringeLoteAplicvac restringeLoteAplicvac
   * @generated
   */
  public HyUnidsau setRestringeLoteAplicvac(java.lang.String restringeLoteAplicvac){
    this.restringeLoteAplicvac = restringeLoteAplicvac;
    return this;
  }

  /**
   * Obtém restringerettipoat
   * return restringerettipoat
   * @generated
   */
  
  public java.lang.String getRestringerettipoat(){
    return this.restringerettipoat;
  }

  /**
   * Define restringerettipoat
   * @param restringerettipoat restringerettipoat
   * @generated
   */
  public HyUnidsau setRestringerettipoat(java.lang.String restringerettipoat){
    this.restringerettipoat = restringerettipoat;
    return this;
  }

  /**
   * Obtém retcontiguo
   * return retcontiguo
   * @generated
   */
  
  public java.lang.String getRetcontiguo(){
    return this.retcontiguo;
  }

  /**
   * Define retcontiguo
   * @param retcontiguo retcontiguo
   * @generated
   */
  public HyUnidsau setRetcontiguo(java.lang.String retcontiguo){
    this.retcontiguo = retcontiguo;
    return this;
  }

  /**
   * Obtém sigla
   * return sigla
   * @generated
   */
  
  public java.lang.String getSigla(){
    return this.sigla;
  }

  /**
   * Define sigla
   * @param sigla sigla
   * @generated
   */
  public HyUnidsau setSigla(java.lang.String sigla){
    this.sigla = sigla;
    return this;
  }

  /**
   * Obtém tamanhosenha
   * return tamanhosenha
   * @generated
   */
  
  public java.lang.Integer getTamanhosenha(){
    return this.tamanhosenha;
  }

  /**
   * Define tamanhosenha
   * @param tamanhosenha tamanhosenha
   * @generated
   */
  public HyUnidsau setTamanhosenha(java.lang.Integer tamanhosenha){
    this.tamanhosenha = tamanhosenha;
    return this;
  }

  /**
   * Obtém tempoNaoResp
   * return tempoNaoResp
   * @generated
   */
  
  public java.lang.Integer getTempoNaoResp(){
    return this.tempoNaoResp;
  }

  /**
   * Define tempoNaoResp
   * @param tempoNaoResp tempoNaoResp
   * @generated
   */
  public HyUnidsau setTempoNaoResp(java.lang.Integer tempoNaoResp){
    this.tempoNaoResp = tempoNaoResp;
    return this;
  }

  /**
   * Obtém tempoPenalidade
   * return tempoPenalidade
   * @generated
   */
  
  public java.lang.Long getTempoPenalidade(){
    return this.tempoPenalidade;
  }

  /**
   * Define tempoPenalidade
   * @param tempoPenalidade tempoPenalidade
   * @generated
   */
  public HyUnidsau setTempoPenalidade(java.lang.Long tempoPenalidade){
    this.tempoPenalidade = tempoPenalidade;
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
  public HyUnidsau setTipologend(java.lang.String tipologend){
    this.tipologend = tipologend;
    return this;
  }

  /**
   * Obtém tipousCodigo
   * return tipousCodigo
   * @generated
   */
  
  public java.lang.String getTipousCodigo(){
    return this.tipousCodigo;
  }

  /**
   * Define tipousCodigo
   * @param tipousCodigo tipousCodigo
   * @generated
   */
  public HyUnidsau setTipousCodigo(java.lang.String tipousCodigo){
    this.tipousCodigo = tipousCodigo;
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
  public HyUnidsau setUfender(java.lang.String ufender){
    this.ufender = ufender;
    return this;
  }

  /**
   * Obtém upaAcolClassRisco
   * return upaAcolClassRisco
   * @generated
   */
  
  public java.lang.String getUpaAcolClassRisco(){
    return this.upaAcolClassRisco;
  }

  /**
   * Define upaAcolClassRisco
   * @param upaAcolClassRisco upaAcolClassRisco
   * @generated
   */
  public HyUnidsau setUpaAcolClassRisco(java.lang.String upaAcolClassRisco){
    this.upaAcolClassRisco = upaAcolClassRisco;
    return this;
  }

  /**
   * Obtém upaAutoimpEtqpac
   * return upaAutoimpEtqpac
   * @generated
   */
  
  public java.lang.String getUpaAutoimpEtqpac(){
    return this.upaAutoimpEtqpac;
  }

  /**
   * Define upaAutoimpEtqpac
   * @param upaAutoimpEtqpac upaAutoimpEtqpac
   * @generated
   */
  public HyUnidsau setUpaAutoimpEtqpac(java.lang.String upaAutoimpEtqpac){
    this.upaAutoimpEtqpac = upaAutoimpEtqpac;
    return this;
  }

  /**
   * Obtém upaAutominMed
   * return upaAutominMed
   * @generated
   */
  
  public java.lang.String getUpaAutominMed(){
    return this.upaAutominMed;
  }

  /**
   * Define upaAutominMed
   * @param upaAutominMed upaAutominMed
   * @generated
   */
  public HyUnidsau setUpaAutominMed(java.lang.String upaAutominMed){
    this.upaAutominMed = upaAutominMed;
    return this;
  }

  /**
   * Obtém upaClassrisco
   * return upaClassrisco
   * @generated
   */
  
  public java.lang.String getUpaClassrisco(){
    return this.upaClassrisco;
  }

  /**
   * Define upaClassrisco
   * @param upaClassrisco upaClassrisco
   * @generated
   */
  public HyUnidsau setUpaClassrisco(java.lang.String upaClassrisco){
    this.upaClassrisco = upaClassrisco;
    return this;
  }

  /**
   * Obtém upaMostraLivre
   * return upaMostraLivre
   * @generated
   */
  
  public java.lang.String getUpaMostraLivre(){
    return this.upaMostraLivre;
  }

  /**
   * Define upaMostraLivre
   * @param upaMostraLivre upaMostraLivre
   * @generated
   */
  public HyUnidsau setUpaMostraLivre(java.lang.String upaMostraLivre){
    this.upaMostraLivre = upaMostraLivre;
    return this;
  }

  /**
   * Obtém upaMostraRemo
   * return upaMostraRemo
   * @generated
   */
  
  public java.lang.String getUpaMostraRemo(){
    return this.upaMostraRemo;
  }

  /**
   * Define upaMostraRemo
   * @param upaMostraRemo upaMostraRemo
   * @generated
   */
  public HyUnidsau setUpaMostraRemo(java.lang.String upaMostraRemo){
    this.upaMostraRemo = upaMostraRemo;
    return this;
  }

  /**
   * Obtém upaQueixaprima
   * return upaQueixaprima
   * @generated
   */
  
  public java.lang.String getUpaQueixaprima(){
    return this.upaQueixaprima;
  }

  /**
   * Define upaQueixaprima
   * @param upaQueixaprima upaQueixaprima
   * @generated
   */
  public HyUnidsau setUpaQueixaprima(java.lang.String upaQueixaprima){
    this.upaQueixaprima = upaQueixaprima;
    return this;
  }

  /**
   * Obtém upaSinaisVitais
   * return upaSinaisVitais
   * @generated
   */
  
  public java.lang.String getUpaSinaisVitais(){
    return this.upaSinaisVitais;
  }

  /**
   * Define upaSinaisVitais
   * @param upaSinaisVitais upaSinaisVitais
   * @generated
   */
  public HyUnidsau setUpaSinaisVitais(java.lang.String upaSinaisVitais){
    this.upaSinaisVitais = upaSinaisVitais;
    return this;
  }

  /**
   * Obtém usaChamaPainel
   * return usaChamaPainel
   * @generated
   */
  
  public java.lang.String getUsaChamaPainel(){
    return this.usaChamaPainel;
  }

  /**
   * Define usaChamaPainel
   * @param usaChamaPainel usaChamaPainel
   * @generated
   */
  public HyUnidsau setUsaChamaPainel(java.lang.String usaChamaPainel){
    this.usaChamaPainel = usaChamaPainel;
    return this;
  }

  /**
   * Obtém usuUpa
   * return usuUpa
   * @generated
   */
  
  public java.lang.String getUsuUpa(){
    return this.usuUpa;
  }

  /**
   * Define usuUpa
   * @param usuUpa usuUpa
   * @generated
   */
  public HyUnidsau setUsuUpa(java.lang.String usuUpa){
    this.usuUpa = usuUpa;
    return this;
  }

  /**
   * Obtém usuUpaFarma
   * return usuUpaFarma
   * @generated
   */
  
  public java.lang.String getUsuUpaFarma(){
    return this.usuUpaFarma;
  }

  /**
   * Define usuUpaFarma
   * @param usuUpaFarma usuUpaFarma
   * @generated
   */
  public HyUnidsau setUsuUpaFarma(java.lang.String usuUpaFarma){
    this.usuUpaFarma = usuUpaFarma;
    return this;
  }

  /**
   * Obtém usuUpaFarmaSenha
   * return usuUpaFarmaSenha
   * @generated
   */
  
  public java.lang.String getUsuUpaFarmaSenha(){
    return this.usuUpaFarmaSenha;
  }

  /**
   * Define usuUpaFarmaSenha
   * @param usuUpaFarmaSenha usuUpaFarmaSenha
   * @generated
   */
  public HyUnidsau setUsuUpaFarmaSenha(java.lang.String usuUpaFarmaSenha){
    this.usuUpaFarmaSenha = usuUpaFarmaSenha;
    return this;
  }

  /**
   * Obtém usuUpaMed
   * return usuUpaMed
   * @generated
   */
  
  public java.lang.String getUsuUpaMed(){
    return this.usuUpaMed;
  }

  /**
   * Define usuUpaMed
   * @param usuUpaMed usuUpaMed
   * @generated
   */
  public HyUnidsau setUsuUpaMed(java.lang.String usuUpaMed){
    this.usuUpaMed = usuUpaMed;
    return this;
  }

  /**
   * Obtém usuUpaMedSenha
   * return usuUpaMedSenha
   * @generated
   */
  
  public java.lang.String getUsuUpaMedSenha(){
    return this.usuUpaMedSenha;
  }

  /**
   * Define usuUpaMedSenha
   * @param usuUpaMedSenha usuUpaMedSenha
   * @generated
   */
  public HyUnidsau setUsuUpaMedSenha(java.lang.String usuUpaMedSenha){
    this.usuUpaMedSenha = usuUpaMedSenha;
    return this;
  }

  /**
   * Obtém usuUpaProced
   * return usuUpaProced
   * @generated
   */
  
  public java.lang.String getUsuUpaProced(){
    return this.usuUpaProced;
  }

  /**
   * Define usuUpaProced
   * @param usuUpaProced usuUpaProced
   * @generated
   */
  public HyUnidsau setUsuUpaProced(java.lang.String usuUpaProced){
    this.usuUpaProced = usuUpaProced;
    return this;
  }

  /**
   * Obtém usuUpaProcedSenha
   * return usuUpaProcedSenha
   * @generated
   */
  
  public java.lang.String getUsuUpaProcedSenha(){
    return this.usuUpaProcedSenha;
  }

  /**
   * Define usuUpaProcedSenha
   * @param usuUpaProcedSenha usuUpaProcedSenha
   * @generated
   */
  public HyUnidsau setUsuUpaProcedSenha(java.lang.String usuUpaProcedSenha){
    this.usuUpaProcedSenha = usuUpaProcedSenha;
    return this;
  }

  /**
   * Obtém usuUpaSenha
   * return usuUpaSenha
   * @generated
   */
  
  public java.lang.String getUsuUpaSenha(){
    return this.usuUpaSenha;
  }

  /**
   * Define usuUpaSenha
   * @param usuUpaSenha usuUpaSenha
   * @generated
   */
  public HyUnidsau setUsuUpaSenha(java.lang.String usuUpaSenha){
    this.usuUpaSenha = usuUpaSenha;
    return this;
  }

  /**
   * Obtém vacina
   * return vacina
   * @generated
   */
  
  public java.lang.String getVacina(){
    return this.vacina;
  }

  /**
   * Define vacina
   * @param vacina vacina
   * @generated
   */
  public HyUnidsau setVacina(java.lang.String vacina){
    this.vacina = vacina;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    HyUnidsau object = (HyUnidsau)obj;
    if (codunidsau != null ? !codunidsau.equals(object.codunidsau) : object.codunidsau != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((codunidsau == null) ? 0 : codunidsau.hashCode());
    return result;
  }

}
