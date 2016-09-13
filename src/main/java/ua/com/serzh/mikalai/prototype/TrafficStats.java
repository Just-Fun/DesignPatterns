// ============================================================================
//  File          : TrafficStats
//  Created       : 12.09.2015   
//  Description   :
//  Modifications :
//
// ============================================================================
//  Copyright(c) 2015 Zoral, Ukraine
// ============================================================================
package ua.com.serzh.mikalai.prototype;

import java.util.Date;

/**
 * @author Alimenkou Mikalai
 * @version 1.0
 */
public class TrafficStats implements Stats<TrafficStats> {
    private final long domainId;
    private final Date rankDate;

    private long estimatedTraffic;

    public TrafficStats(long domainId, Date rankDate) {
        this.domainId = domainId;
        this.rankDate = rankDate;
    }

    private TrafficStats(long domainId, Date rankDate, long traffic) {
        this(domainId, rankDate);
        this.estimatedTraffic = traffic;
    }

    public long getDomainId() {
        return domainId;
    }

    public Date getRankDate() {
        return rankDate;
    }

    public void setEstimatedTraffic(long estimatedTraffic) {
        this.estimatedTraffic = estimatedTraffic;
    }

    public long getEstimatedTraffic() {
        return estimatedTraffic;
    }

    @Override
    public TrafficStats add(TrafficStats delta) {
        return new TrafficStats(domainId, rankDate, estimatedTraffic + delta.estimatedTraffic);
    }

    @Override
    public TrafficStats invert(Date forDate) {
        return new TrafficStats(domainId, forDate, -estimatedTraffic);
    }

    @Override
    public String toString() {
        return "TrafficStats{domainId=" + domainId + ", rankDate=" + rankDate +
                ", estimatedTraffic=" + estimatedTraffic + "}";
    }
}