package edu.nju.se.teamnamecannotbeempty.backend.vo;

import edu.nju.se.teamnamecannotbeempty.backend.serviceImpl.paper.TitleAndId;
import edu.nju.se.teamnamecannotbeempty.backend.serviceImpl.visualization.KeywordsYear;

import java.util.List;
import java.util.Objects;

public class AcademicEntityVO {
    private int type;
    private long id;
    private String name;
    private int refSum;
    private List<AcademicEntityItem> authors;
    private List<AcademicEntityItem> affiliations;
    private List<AcademicEntityItem> conferences;
    private List<TermItem> terms;
    private List<YearlyTerm> yearlyTerms;
    private List<SimplePaperVO> significantPapers;
    //以空格隔开的字符串，n个数字，第一个数字是年份
    private String popTrend;
    private List<KeywordsYear> keywordsYears;
    private List<YearlyAffiliation> yearlyAffiliationList;
    private List<TitleAndId> refers;
    private List<TitleAndId> referees;

    public AcademicEntityVO(int type, long id, String name, int refSum,
                            List<AcademicEntityItem> authors, List<AcademicEntityItem> affiliations,
                            List<AcademicEntityItem> conferences, List<TermItem> terms,
                            List<SimplePaperVO> significantPapers, List<YearlyTerm> yearlyTerms,
                            String popTrend, List<YearlyAffiliation> yearlyAffiliationList, List<KeywordsYear> keywordsYears) {
        this.type = type;
        this.id = id;
        this.name = name;
        this.refSum = refSum;
        this.authors = authors;
        this.affiliations = affiliations;
        this.conferences = conferences;
        this.terms = terms;
        this.significantPapers = significantPapers;
        this.yearlyTerms = yearlyTerms;
        this.popTrend = popTrend;
        this.yearlyAffiliationList=yearlyAffiliationList;
        this.keywordsYears=keywordsYears;
    }

    public AcademicEntityVO(int type, long id, String name, int refSum,
                            List<AcademicEntityItem> authors, List<AcademicEntityItem> affiliations,
                            List<AcademicEntityItem> conferences, List<TermItem> terms,
                            List<SimplePaperVO> significantPapers, List<YearlyTerm> yearlyTerms,
                            String popTrend, List<YearlyAffiliation> yearlyAffiliationList, List<KeywordsYear> keywordsYears
    , List<TitleAndId> refers,List<TitleAndId> referees) {
        this.type = type;
        this.id = id;
        this.name = name;
        this.refSum = refSum;
        this.authors = authors;
        this.affiliations = affiliations;
        this.conferences = conferences;
        this.terms = terms;
        this.significantPapers = significantPapers;
        this.yearlyTerms = yearlyTerms;
        this.popTrend = popTrend;
        this.yearlyAffiliationList=yearlyAffiliationList;
        this.keywordsYears=keywordsYears;
        this.refers=refers;
        this.referees=referees;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRefSum() {
        return refSum;
    }

    public void setRefSum(int refSum) {
        this.refSum = refSum;
    }

    public List<AcademicEntityItem> getAuthors() {
        return authors;
    }

    public void setAuthors(List<AcademicEntityItem> authors) {
        this.authors = authors;
    }

    public List<AcademicEntityItem> getAffiliations() {
        return affiliations;
    }

    public void setAffiliations(List<AcademicEntityItem> affiliations) {
        this.affiliations = affiliations;
    }

    public List<AcademicEntityItem> getConferences() {
        return conferences;
    }

    public void setConferences(List<AcademicEntityItem> conferences) {
        this.conferences = conferences;
    }

    public List<TermItem> getTerms() {
        return terms;
    }

    public void setTerms(List<TermItem> terms) {
        this.terms = terms;
    }

    public List<SimplePaperVO> getSignificantPapers() {
        return significantPapers;
    }

    public List<YearlyTerm> getYearlyTerms() {
        return yearlyTerms;
    }

    public void setYearlyTerms(List<YearlyTerm> yearlyTerms) {
        this.yearlyTerms = yearlyTerms;
    }

    public void setSignificantPapers(List<SimplePaperVO> significantPapers) {
        this.significantPapers = significantPapers;
    }

    public String getPopTrend() {
        return popTrend;
    }

    public void setPopTrend(String popTrend) {
        this.popTrend = popTrend;
    }

    public List<KeywordsYear> getKeywordsYears() {
        return keywordsYears;
    }

    public void setKeywordsYears(List<KeywordsYear> keywordsYears) {
        this.keywordsYears = keywordsYears;
    }

    public List<YearlyAffiliation> getYearlyAffiliationList() {
        return yearlyAffiliationList;
    }

    public void setYearlyAffiliationList(List<YearlyAffiliation> yearlyAffiliationList) {
        this.yearlyAffiliationList = yearlyAffiliationList;
    }

    public void setRefers(List<TitleAndId> refers) {
        this.refers = refers;
    }

    public void setReferees(List<TitleAndId> referees) {
        this.referees = referees;
    }

    public List<TitleAndId> getRefers() {
        return refers;
    }

    public List<TitleAndId> getReferees() {
        return referees;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AcademicEntityVO that = (AcademicEntityVO) o;
        return type == that.type &&
                id == that.id &&
                refSum == that.refSum &&
                Objects.equals(name, that.name) &&
                Objects.equals(authors, that.authors) &&
                Objects.equals(affiliations, that.affiliations) &&
                Objects.equals(conferences, that.conferences) &&
                Objects.equals(terms, that.terms) &&
                Objects.equals(yearlyTerms, that.yearlyTerms) &&
                Objects.equals(significantPapers, that.significantPapers)&&
                Objects.equals(popTrend,that.popTrend);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, id, name, refSum, authors, affiliations,
                conferences, terms, yearlyTerms, significantPapers,popTrend);
    }
}
