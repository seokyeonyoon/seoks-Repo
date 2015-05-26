package mybatis.hr.vo;

import java.io.Serializable;
import java.util.List;

public class Publisher implements Serializable{
	private int publisherNo;
	private String publisherName;
	private String publisherAddress;
	private String publisherTel;
	
	private List<Book> books;
	
	public Publisher() {
		// TODO Auto-generated constructor stub
	}

	public Publisher(int publisherNo, String publisherName,
			String publisherAddress, String publisherTel, List<Book> books) {
		super();
		this.publisherNo = publisherNo;
		this.publisherName = publisherName;
		this.publisherAddress = publisherAddress;
		this.publisherTel = publisherTel;
		this.books = books;
	}

	
	
	public int getPublisherNo() {
		return publisherNo;
	}

	public void setPublisherNo(int publisherNo) {
		this.publisherNo = publisherNo;
	}

	public String getPublisherName() {
		return publisherName;
	}

	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}

	public String getPublisherAddress() {
		return publisherAddress;
	}

	public void setPublisherAddress(String publisherAddress) {
		this.publisherAddress = publisherAddress;
	}

	public String getPublisherTel() {
		return publisherTel;
	}

	public void setPublisherTel(String publisherTel) {
		this.publisherTel = publisherTel;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((books == null) ? 0 : books.hashCode());
		result = prime
				* result
				+ ((publisherAddress == null) ? 0 : publisherAddress.hashCode());
		result = prime * result
				+ ((publisherName == null) ? 0 : publisherName.hashCode());
		result = prime * result + publisherNo;
		result = prime * result
				+ ((publisherTel == null) ? 0 : publisherTel.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Publisher other = (Publisher) obj;
		if (books == null) {
			if (other.books != null)
				return false;
		} else if (!books.equals(other.books))
			return false;
		if (publisherAddress == null) {
			if (other.publisherAddress != null)
				return false;
		} else if (!publisherAddress.equals(other.publisherAddress))
			return false;
		if (publisherName == null) {
			if (other.publisherName != null)
				return false;
		} else if (!publisherName.equals(other.publisherName))
			return false;
		if (publisherNo != other.publisherNo)
			return false;
		if (publisherTel == null) {
			if (other.publisherTel != null)
				return false;
		} else if (!publisherTel.equals(other.publisherTel))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "publisher [publisherNo=" + publisherNo + ", publisherName="
				+ publisherName + ", publisherAddress=" + publisherAddress
				+ ", publisherTel=" + publisherTel + ", books=" + books + "]";
	}
	
	
}

