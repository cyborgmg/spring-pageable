package com.bezkoder.spring.springpageable.dto;

import com.bezkoder.spring.springpageable.entity.Tabela;

import java.util.List;

public class PaginaTabelaDTO {

    private List<Tabela> tabelas;
    private Integer currentPage;
    private Long totalItems;
    private Integer totalPages;

    public List<Tabela> getTabelas() {
        return tabelas;
    }

    public void setTabelas(List<Tabela> tabelas) {
        this.tabelas = tabelas;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Long getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(Long totalItems) {
        this.totalItems = totalItems;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }
}
