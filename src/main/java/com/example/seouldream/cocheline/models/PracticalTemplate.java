package com.example.seouldream.cocheline.models;

import com.example.seouldream.cocheline.dtos.*;
import org.hibernate.annotations.*;

import javax.persistence.*;
import javax.persistence.Entity;
import java.time.*;

@Entity
public class PracticalTemplate {
  @Id
  @GeneratedValue
  private Long id;
  private Long categoryId;
  @Column(name="title", length = 2048)
  private String title;
  @Column(name="description", length = 2048)
  private String description;
  @Column(name="koreanSentence", length = 2048)
  private String koreanSentence;
  @Column(name="bestPractice", length = 2048)
  private String bestPractice;
  @Column(name="recordUrl", length = 2048)
  private String recordUrl;

  @CreationTimestamp
  private LocalDateTime createdAt;

  public Long getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public String getDescription() {
    return description;
  }

  public String getKoreanSentence() {
    return koreanSentence;
  }

  public String getBestPractice() {
    return bestPractice;
  }

  public String getRecordUrl() {
    return recordUrl;
  }

  public Long getCategoryId() {
    return categoryId;
  }

  public PracticalTemplate() {
  }

  public PracticalTemplate(Long categoryId, String title, String description, String koreanSentence, String bestPractice, String recordUrl) {
    this.categoryId = categoryId;
    this.title = title;
    this.description = description;
    this.koreanSentence = koreanSentence;
    this.bestPractice = bestPractice;
    this.recordUrl = recordUrl;
  }

  public PracticalTemplate(Long id, Long categoryId, String title, String description, String koreanSentence, String bestPractice, String recordUrl) {
    this.id = id;
    this.categoryId = categoryId;
    this.title = title;
    this.description = description;
    this.koreanSentence = koreanSentence;
    this.bestPractice = bestPractice;
    this.recordUrl = recordUrl;
  }

  public static PracticalTemplate example1ByCategoryCafe() {
    return new PracticalTemplate(
        1L,
        1L,
        "??????????????????",
        "?????? ????????? ??? ????????????",
        "???! ?????? ??? ??? ????????????!?",
        "can I get a coffee?",
        "????????????"
    );
  }

  public static PracticalTemplate example2ByCategoryCafe() {
    return new PracticalTemplate(
        2L,
        1L,
        "??? ??? ??? ?????? ????????????",
        "?????? ????????? ??? ????????? ????????????",
        "????????? ???????????? ??? ??? ??? ?????????.",
        "can I get one more shot plz, I wanna get the same as his",
        "????????????"
    );
  }

  public PracticalTemplateDto toDto() {
    return new PracticalTemplateDto(
        id,
        categoryId,
        title,
        description,
        koreanSentence,
        bestPractice,
        recordUrl
    );
  }

  public void update(PracticalTemplateUpdateDto practicalTemplateUpdateDto) {
    this.title = practicalTemplateUpdateDto.getTitle();
    this.description = practicalTemplateUpdateDto.getDescription();
    this.koreanSentence = practicalTemplateUpdateDto.getKoreanSentence();
    this.bestPractice = practicalTemplateUpdateDto.getBestPractice();
  }

  public void update(Long categoryId,PracticalTemplateUpdateDto practicalTemplateUpdateDto) {
    this.categoryId = categoryId;
    this.title = practicalTemplateUpdateDto.getTitle();
    this.description = practicalTemplateUpdateDto.getDescription();
    this.koreanSentence = practicalTemplateUpdateDto.getKoreanSentence();
    this.bestPractice = practicalTemplateUpdateDto.getBestPractice();
  }
}
