package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "SECURITY") 
public class Security {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "security_id") // Ensure column name matches database
    private Long securityId;

    @ManyToOne
    @JoinColumn(name = "portfolio_id", referencedColumnName = "portfolio_id", nullable = false)
    private Portfolio portfolio;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "category", nullable = false)
    private String category;

    @Column(name = "purchase_date", nullable = false, updatable = false)
    private Timestamp purchaseDate;

    @Column(name = "purchase_price", nullable = false)
    private Double purchasePrice;

    @Column(name = "quantity", nullable = false)
    private Integer quantity;

    @Column(name = "created_at", nullable = false, updatable = false)
    private Timestamp createdAt;

    // Default Constructor
    public Security() {}

    // Parameterized Constructor
    public Security(Portfolio portfolio, String name, String category, Timestamp purchaseDate, Double purchasePrice, Integer quantity, Timestamp createdAt) {
        this.portfolio = portfolio;
        this.name = name;
        this.category = category;
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
        this.quantity = quantity;
        this.createdAt = createdAt;
    }

    // Getters and Setters
    public Long getSecurityId() { return securityId; }

    public Portfolio getPortfolio() { return portfolio; }
    public void setPortfolio(Portfolio portfolio) { this.portfolio = portfolio; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public Timestamp getPurchaseDate() { return purchaseDate; }
    public void setPurchaseDate(Timestamp purchaseDate) { this.purchaseDate = purchaseDate; }

    public Double getPurchasePrice() { return purchasePrice; }
    public void setPurchasePrice(Double purchasePrice) { this.purchasePrice = purchasePrice; }

    public Integer getQuantity() { return quantity; }
    public void setQuantity(Integer quantity) { this.quantity = quantity; }

    public Timestamp getCreatedAt() { return createdAt; }
}
