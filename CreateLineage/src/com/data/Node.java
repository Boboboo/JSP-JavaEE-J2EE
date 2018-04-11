package com.data;


//For those node entity in database original_nodes
public class Node {
	private String taxid;
    private String parent_taxid;
    private String rank;
     
	public Node(String taxid, String parent_taxid) {
		super();
		this.taxid = taxid;
		this.parent_taxid = parent_taxid;
	}
	
	public Node(String taxid, String parent_taxid, String rank) {
		super();
		this.taxid = taxid;
		this.parent_taxid = parent_taxid;
		this.rank = rank;
	}
	
	public String getTaxid() {
		return taxid;
	}
	public void setTaxid(String taxid) {
		this.taxid = taxid;
	}
	public String getParent_taxid() {
		return parent_taxid;
	}
	public void setParent_taxid(String parent_taxid) {
		this.parent_taxid = parent_taxid;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}

}
