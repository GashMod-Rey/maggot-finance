package umn.ac.id.project.maggot.model;

import java.util.Date;
import java.util.List;

import umn.ac.id.project.maggot.global.Helper;

public class TransactionModel {
    private List<Transaction> data;

    public TransactionModel(List<Transaction> data) {
        this.data = data;
    }

    public List<Transaction> getAllTransaction() {
        return data;
    }

    private class Transaction {
        private String type, description, transaction_type, weight_in_kg, amount_per_kg, total_amount;
        private Date created_at;
        private double amount;
        private int id,farmer_id, trash_manager_id;

        public Transaction(String type, String description, String transaction_type, String weight_in_kg, String amount_per_kg, String total_amount, Date created_at, double amount, int id, int farmer_id, int trash_manager_id) {
            this.type = type;
            this.description = description;
            this.transaction_type = transaction_type;
            this.weight_in_kg = weight_in_kg;
            this.amount_per_kg = amount_per_kg;
            this.total_amount = total_amount;
            this.created_at = created_at;
            this.amount = amount;
            this.id = id;
            this.farmer_id = farmer_id;
            this.trash_manager_id = trash_manager_id;
        }

        public String getType() {
            return type;
        }

        public String getDescription() {
            return description;
        }

        public String getTransaction_type() {
            return transaction_type;
        }

        public String getWeight_in_kg() {
            return weight_in_kg;
        }

        public String getAmount_per_kg() {
            return amount_per_kg;
        }

        public String getTotal_amount() {
            return total_amount;
        }

        public Date getCreated_at() {
            return created_at;
        }

        public double getAmount() {
            return amount;
        }

        public int getId() {
            return id;
        }

        public int getFarmer_id() {
            return farmer_id;
        }

        public int getTrash_manager_id() {
            return trash_manager_id;
        }

        @Override
        public String toString() {
            return "Transaction{" +
                    "type='" + type + '\'' +
                    ", description='" + description + '\'' +
                    ", transaction_type='" + transaction_type + '\'' +
                    ", weight_in_kg='" + weight_in_kg + '\'' +
                    ", amount_per_kg='" + amount_per_kg + '\'' +
                    ", total_amount='" + total_amount + '\'' +
                    ", created_at=" + created_at +
                    ", amount=" + amount +
                    ", id=" + id +
                    ", farmer_id=" + farmer_id +
                    ", trash_manager_id=" + trash_manager_id +
                    '}';
        }
    }
}
