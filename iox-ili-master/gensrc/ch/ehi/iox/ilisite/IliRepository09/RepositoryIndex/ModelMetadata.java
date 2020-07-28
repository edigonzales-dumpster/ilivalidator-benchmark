package ch.ehi.iox.ilisite.IliRepository09.RepositoryIndex;
public class ModelMetadata extends ch.interlis.iom_j.Iom_jObject
{
  private final static String tag= "IliRepository09.RepositoryIndex.ModelMetadata";
  public ModelMetadata(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  /** Name of model as it is in the ili-file e.g. "DM01AVCH24D"
   */
  public String getName() {
    String value=getattrvalue("Name");
    return value;
  }
  /** Name of model as it is in the ili-file e.g. "DM01AVCH24D"
   */
  public void setName(String value) {
    setattrvalue("Name", value);
  }
  public ModelMetadata_SchemaLanguage getSchemaLanguage() {
    String value=getattrvalue("SchemaLanguage");
    return ModelMetadata_SchemaLanguage.parseXmlCode(value);
  }
  public void setSchemaLanguage(ModelMetadata_SchemaLanguage value) {
    setattrvalue("SchemaLanguage", ModelMetadata_SchemaLanguage.toXmlCode(value));
  }
  /** path of ili-file, as it is in the repository e.g. "av/ch/dm01/24/DM.01-AV-CH_LV03_24d_ili1.ili"
   */
  public String getFile() {
    String value=getattrvalue("File");
    return value;
  }
  /** path of ili-file, as it is in the repository e.g. "av/ch/dm01/24/DM.01-AV-CH_LV03_24d_ili1.ili"
   */
  public void setFile(String value) {
    setattrvalue("File", value);
  }
  /** Version of the model e.g. "DM01.24"
   */
  public String getVersion() {
    String value=getattrvalue("Version");
    return value;
  }
  /** Version of the model e.g. "DM01.24"
   */
  public void setVersion(String value) {
    setattrvalue("Version", value);
  }
  /** Comment about this version (surch as "Draft")
   */
  public String getVersionComment() {
    String value=getattrvalue("VersionComment");
    return value;
  }
  /** Comment about this version (surch as "Draft")
   */
  public void setVersionComment(String value) {
    setattrvalue("VersionComment", value);
  }
  /** date of last publication of this version e.g. "2004-06-04". This should change even with the most minor editorial changes.
   */
  public String getpublishingDate() {
    String value=getattrvalue("publishingDate");
    return value;
  }
  /** date of last publication of this version e.g. "2004-06-04". This should change even with the most minor editorial changes.
   */
  public void setpublishingDate(String value) {
    setattrvalue("publishingDate", value);
  }
  /** Where the owner of a model publishes it.
   * Absolute URL of repository (e.g. "http://www.interlis.ch/models") or ili-file ("http://www.interlis.ch/models/Units.ili")
   */
  public String getOriginal() {
    String value=getattrvalue("Original");
    return value;
  }
  /** Where the owner of a model publishes it.
   * Absolute URL of repository (e.g. "http://www.interlis.ch/models") or ili-file ("http://www.interlis.ch/models/Units.ili")
   */
  public void setOriginal(String value) {
    setattrvalue("Original", value);
  }
  /** union of IMPORT and TRANSLATION OF from models as it is in the ili-file, so that a tool can fetch all required files, before it requires to read/compile them.
   */
  public int sizedependsOnModel() {return getattrvaluecount("dependsOnModel");}
  public ch.ehi.iox.ilisite.IliRepository09.ModelName_[] getdependsOnModel() {
    int size=getattrvaluecount("dependsOnModel");
    ch.ehi.iox.ilisite.IliRepository09.ModelName_ value[]=new ch.ehi.iox.ilisite.IliRepository09.ModelName_[size];
    for(int i=0;i<size;i++){
      value[i]=(ch.ehi.iox.ilisite.IliRepository09.ModelName_)getattrobj("dependsOnModel",i);
    }
    return value;
  }
  /** union of IMPORT and TRANSLATION OF from models as it is in the ili-file, so that a tool can fetch all required files, before it requires to read/compile them.
   */
  public void adddependsOnModel(ch.ehi.iox.ilisite.IliRepository09.ModelName_ value) {
    addattrobj("dependsOnModel", value);
  }
  /** Precursor version of this model e.g. "DM01.23"
   */
  public String getprecursorVersion() {
    String value=getattrvalue("precursorVersion");
    return value;
  }
  /** Precursor version of this model e.g. "DM01.23"
   */
  public void setprecursorVersion(String value) {
    setattrvalue("precursorVersion", value);
  }
  /** Follow-up Name of this model e.g. "DM12AVCH"
   */
  public int sizefollowupModel() {return getattrvaluecount("followupModel");}
  public ch.ehi.iox.ilisite.IliRepository09.ModelName_[] getfollowupModel() {
    int size=getattrvaluecount("followupModel");
    ch.ehi.iox.ilisite.IliRepository09.ModelName_ value[]=new ch.ehi.iox.ilisite.IliRepository09.ModelName_[size];
    for(int i=0;i<size;i++){
      value[i]=(ch.ehi.iox.ilisite.IliRepository09.ModelName_)getattrobj("followupModel",i);
    }
    return value;
  }
  /** Follow-up Name of this model e.g. "DM12AVCH"
   */
  public void addfollowupModel(ch.ehi.iox.ilisite.IliRepository09.ModelName_ value) {
    addattrobj("followupModel", value);
  }
  /** any known derived models. A derived model is one, that does not DEPENDS ON/IMPORT a base model, but otherwise/more weakly depends on a base model, e.g a publication model that depends on a model used for data production.
   */
  public int sizederivedModel() {return getattrvaluecount("derivedModel");}
  public ch.ehi.iox.ilisite.IliRepository09.ModelName_[] getderivedModel() {
    int size=getattrvaluecount("derivedModel");
    ch.ehi.iox.ilisite.IliRepository09.ModelName_ value[]=new ch.ehi.iox.ilisite.IliRepository09.ModelName_[size];
    for(int i=0;i<size;i++){
      value[i]=(ch.ehi.iox.ilisite.IliRepository09.ModelName_)getattrobj("derivedModel",i);
    }
    return value;
  }
  /** any known derived models. A derived model is one, that does not DEPENDS ON/IMPORT a base model, but otherwise/more weakly depends on a base model, e.g a publication model that depends on a model used for data production.
   */
  public void addderivedModel(ch.ehi.iox.ilisite.IliRepository09.ModelName_ value) {
    addattrobj("derivedModel", value);
  }
  /** Title of model e.g. "Datenmodell Amtliche Vermessung"
   */
  public String getTitle() {
    String value=getattrvalue("Title");
    return value;
  }
  /** Title of model e.g. "Datenmodell Amtliche Vermessung"
   */
  public void setTitle(String value) {
    setattrvalue("Title", value);
  }
  /** A short description of this model.
   */
  public String getshortDescription() {
    String value=getattrvalue("shortDescription");
    return value;
  }
  /** A short description of this model.
   */
  public void setshortDescription(String value) {
    setattrvalue("shortDescription", value);
  }
  /** Comma seperated list of terms associated with this model e.g. "DM01"
   */
  public String getTags() {
    String value=getattrvalue("Tags");
    return value;
  }
  /** Comma seperated list of terms associated with this model e.g. "DM01"
   */
  public void setTags(String value) {
    setattrvalue("Tags", value);
  }
  /** Who published this model e.g. "http://www.swisstopo.ch"
   */
  public String getIssuer() {
    String value=getattrvalue("Issuer");
    return value;
  }
  /** Who published this model e.g. "http://www.swisstopo.ch"
   */
  public void setIssuer(String value) {
    setattrvalue("Issuer", value);
  }
  /** Who should be adressed with technical questions e.g. "mailto:infovd@swisstopo.ch"
   */
  public String gettechnicalContact() {
    String value=getattrvalue("technicalContact");
    return value;
  }
  /** Who should be adressed with technical questions e.g. "mailto:infovd@swisstopo.ch"
   */
  public void settechnicalContact(String value) {
    setattrvalue("technicalContact", value);
  }
  /** Reference to document or website with further information, for example UML diagrams, sample data, software etc.
   */
  public String getfurtherInformation() {
    String value=getattrvalue("furtherInformation");
    return value;
  }
  /** Reference to document or website with further information, for example UML diagrams, sample data, software etc.
   */
  public void setfurtherInformation(String value) {
    setattrvalue("furtherInformation", value);
  }
  /** Reference to machine readable data with further information about the model
   */
  public String getfurtherMetadata() {
    String value=getattrvalue("furtherMetadata");
    return value;
  }
  /** Reference to machine readable data with further information about the model
   */
  public void setfurtherMetadata(String value) {
    setattrvalue("furtherMetadata", value);
  }
  /** any known WMS that serve data according to this model
   */
  public int sizeknownWMS() {return getattrvaluecount("knownWMS");}
  public ch.ehi.iox.ilisite.IliRepository09.WebService_[] getknownWMS() {
    int size=getattrvaluecount("knownWMS");
    ch.ehi.iox.ilisite.IliRepository09.WebService_ value[]=new ch.ehi.iox.ilisite.IliRepository09.WebService_[size];
    for(int i=0;i<size;i++){
      value[i]=(ch.ehi.iox.ilisite.IliRepository09.WebService_)getattrobj("knownWMS",i);
    }
    return value;
  }
  /** any known WMS that serve data according to this model
   */
  public void addknownWMS(ch.ehi.iox.ilisite.IliRepository09.WebService_ value) {
    addattrobj("knownWMS", value);
  }
  /** any knwon WFS that serve data according to this model
   */
  public int sizeknownWFS() {return getattrvaluecount("knownWFS");}
  public ch.ehi.iox.ilisite.IliRepository09.WebService_[] getknownWFS() {
    int size=getattrvaluecount("knownWFS");
    ch.ehi.iox.ilisite.IliRepository09.WebService_ value[]=new ch.ehi.iox.ilisite.IliRepository09.WebService_[size];
    for(int i=0;i<size;i++){
      value[i]=(ch.ehi.iox.ilisite.IliRepository09.WebService_)getattrobj("knownWFS",i);
    }
    return value;
  }
  /** any knwon WFS that serve data according to this model
   */
  public void addknownWFS(ch.ehi.iox.ilisite.IliRepository09.WebService_ value) {
    addattrobj("knownWFS", value);
  }
  /** any known portal where a user could view or download data according to this model
   */
  public int sizeknownPortal() {return getattrvaluecount("knownPortal");}
  public ch.ehi.iox.ilisite.IliRepository09.WebSite_[] getknownPortal() {
    int size=getattrvaluecount("knownPortal");
    ch.ehi.iox.ilisite.IliRepository09.WebSite_ value[]=new ch.ehi.iox.ilisite.IliRepository09.WebSite_[size];
    for(int i=0;i<size;i++){
      value[i]=(ch.ehi.iox.ilisite.IliRepository09.WebSite_)getattrobj("knownPortal",i);
    }
    return value;
  }
  /** any known portal where a user could view or download data according to this model
   */
  public void addknownPortal(ch.ehi.iox.ilisite.IliRepository09.WebSite_ value) {
    addattrobj("knownPortal", value);
  }
  /** true, if this model should be ignored during model-file look-up
   */
  public boolean getbrowseOnly() {
    String value=getattrvalue("browseOnly");
    return value!=null && value.equals("true");
  }
  /** true, if this model should be ignored during model-file look-up
   */
  public void setbrowseOnly(boolean value) {
    setattrvalue("browseOnly", value?"true":"false");
  }
  public String getmd5() {
    String value=getattrvalue("md5");
    return value;
  }
  public void setmd5(String value) {
    setattrvalue("md5", value);
  }
}
