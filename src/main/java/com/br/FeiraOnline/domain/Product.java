package com.br.FeiraOnline.domain;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Product implements Serializable{
	
	private static final long serialVersionUID = 1L;
		
		@Id
		private String id;
		private String imagem;
		private String NomeProduto;
		private String Observacoes;
		private String contato;
		
		public Product(String id, String imagem, String nomeProduto, String observacoes, String contato) {
			super();
			this.id = id;
			this.imagem = imagem;
			NomeProduto = nomeProduto;
			Observacoes = observacoes;
			this.contato = contato;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getImagem() {
			return imagem;
		}

		public void setImagem(String imagem) {
			this.imagem = imagem;
		}

		public String getNomeProduto() {
			return NomeProduto;
		}

		public void setNomeProduto(String nomeProduto) {
			NomeProduto = nomeProduto;
		}

		public String getObservacoes() {
			return Observacoes;
		}

		public void setObservacoes(String observacoes) {
			Observacoes = observacoes;
		}

		public String getContato() {
			return contato;
		}

		public void setContato(String contato) {
			this.contato = contato;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((id == null) ? 0 : id.hashCode());
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
			Product other = (Product) obj;
			if (id == null) {
				if (other.id != null)
					return false;
			} else if (!id.equals(other.id))
				return false;
			return true;
		}
		
		
		
		
		
		
}
