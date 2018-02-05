package org.dapnet.core.data;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "Node")
@Table(name = "nodes")
public class Node implements Serializable {

	public enum Status {
		UNKNOWN, OFFLINE, ONLINE
	}

	private static final long serialVersionUID = -7074417111402696260L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, updatable = false)
	private int id;
	@Column(unique = true, nullable = false)
	private String name;
	@Enumerated(EnumType.ORDINAL)
	@Column(nullable = false)
	private Status status = Status.UNKNOWN;

	public int getId() {
		return id;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

}
