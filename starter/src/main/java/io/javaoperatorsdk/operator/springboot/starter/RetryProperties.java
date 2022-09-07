package io.javaoperatorsdk.operator.springboot.starter;

public class RetryProperties {

  private Integer maxAttempts;
  private Long initialInterval;
  private Double intervalMultiplier;
  private Long maxInterval;

  public Integer getMaxAttempts() {
    return maxAttempts;
  }

  public RetryProperties setMaxAttempts(Integer maxAttempts) {
    this.maxAttempts = maxAttempts;
    return this;
  }

  public Long getInitialInterval() {
    return initialInterval;
  }

  public RetryProperties setInitialInterval(Long initialInterval) {
    this.initialInterval = initialInterval;
    return this;
  }

  public Double getIntervalMultiplier() {
    return intervalMultiplier;
  }

  public RetryProperties setIntervalMultiplier(Double intervalMultiplier) {
    this.intervalMultiplier = intervalMultiplier;
    return this;
  }

  public Long getMaxInterval() {
    return maxInterval;
  }

  public RetryProperties setMaxInterval(Long maxInterval) {
    this.maxInterval = maxInterval;
    return this;
  }

}
