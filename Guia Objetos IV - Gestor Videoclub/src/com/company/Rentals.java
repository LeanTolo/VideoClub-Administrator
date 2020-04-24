package com.company;

import java.time.LocalDate;

public class Rentals {

        private String clientName;
        private String title;
        private LocalDate rentDate;
        private LocalDate devolutionDate;

        public Rentals(String clientName,String title){
            this.clientName = clientName;
            this.title = title;
            this.rentDate = LocalDate.now();
            this.devolutionDate = LocalDate.now().plusDays(7);
        }

    public String getTitle() {
        return title;
    }

    public String getClientName() {
        return clientName;
    }

    @Override
        public String toString(){
            return ("\nClient: "+this.clientName+"\nTitle: "+this.title+"\nRent Date: "+this.rentDate+
                    "\nDevolution Rent Date: "+this.devolutionDate);
        }



}
