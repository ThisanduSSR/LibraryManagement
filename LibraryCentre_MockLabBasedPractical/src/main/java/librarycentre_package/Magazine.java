package librarycentre_package;

public class Magazine extends Item {
    private int issueNo;
    private int publicationFrequency;
    private String editor;

    public Magazine(String title, String ISBN){
        super(title, ISBN);
    }
    public int getIssueNo() {
        return issueNo;
    }
    public void setIssueNo(int issueNo) {
        this.issueNo = issueNo;
    }
    public int getPublicationFrequency(){
        return publicationFrequency;
    }
    public void setPublicationFrequency(int publicationFrequency) {
        this.publicationFrequency = publicationFrequency;
    }
    public String getEditor() {
        return editor;
    }
    public void setEditor(String editor) {
        this.editor = editor;
    }
    public String toString() {
        return "Magazine:"+getTitle() + "Editor:"+editor+"issue No:"+issueNo+"publication frequency:"+publicationFrequency;
    }
}
