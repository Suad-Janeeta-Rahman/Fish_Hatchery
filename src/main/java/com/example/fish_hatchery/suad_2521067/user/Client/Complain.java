package com.example.fish_hatchery.suad_2521067.user.Client;

import java.time.LocalDate;

public class Complain {

    public class Rating {
        private  String complainId;
        private String orderId;
        private String buyerId;
        private String speciesName;
        private String issueCategory;
        private int affectedQuantity;
        private String description;
        private LocalDate complainDate;

        public Rating(String complainId, String orderId, String buyerId, String speciesName, String issueCategory, int affectedQuantity, String description, LocalDate complainDate) {
            this.complainId = complainId;
            this.orderId = orderId;
            this.buyerId = buyerId;
            this.speciesName = speciesName;
            this.issueCategory = issueCategory;
            this.affectedQuantity = affectedQuantity;
            this.description = description;
            this.complainDate = complainDate;
        }

        public String getComplainId() {
            return complainId;
        }

        public String getOrderId() {
            return orderId;
        }

        public String getBuyerId() {
            return buyerId;
        }

        public String getSpeciesName() {
            return speciesName;
        }

        public String getIssueCategory() {
            return issueCategory;
        }

        public int getAffectedQuantity() {
            return affectedQuantity;
        }

        public String getDescription() {
            return description;
        }

        public LocalDate getComplainDate() {
            return complainDate;
        }

        public void setIssueCategory(String issueCategory) {
            this.issueCategory = issueCategory;
        }

        public void setAffectedQuantity(int affectedQuantity) {
            this.affectedQuantity = affectedQuantity;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        @Override
        public String toString() {
            return "Rating{" +
                    "complainId='" + complainId + '\'' +
                    ", orderId='" + orderId + '\'' +
                    ", buyerId='" + buyerId + '\'' +
                    ", speciesName='" + speciesName + '\'' +
                    ", issueCategory='" + issueCategory + '\'' +
                    ", affectedQuantity=" + affectedQuantity +
                    ", description='" + description + '\'' +
                    ", complainDate=" + complainDate +
                    '}';
        }
    }

}
