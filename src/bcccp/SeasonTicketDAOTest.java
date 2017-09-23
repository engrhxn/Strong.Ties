

    

        

    

    @Test
    void findTicketById(){
        // Creating Object
        ISeasonTicket iSeasonTicket;
        IUsageRecordFactory factory = new IUsageRecordFactory() {
            @Override
            public IUsageRecord make(String ticketId, long startDateTime) {
                return null;
            }
        };
        SeasonTicketDAO seasonTicketDAO = new SeasonTicketDAO(factory);
        iSeasonTicket = seasonTicketDAO.findTicketById("736366336363");
        assertEquals(null, iSeasonTicket);
    }

    @Test
    void getNumberOfTickets(){
        // Creating Object
        ISeasonTicket iSeasonTicket;
        IUsageRecordFactory factory = new IUsageRecordFactory() {
            @Override
            public IUsageRecord make(String ticketId, long startDateTime) {
                return null;
            }
        };
        SeasonTicketDAO seasonTicketDAO = new SeasonTicketDAO(factory);
        iSeasonTicket = seasonTicketDAO.findTicketById("736366336363");
        assertEquals(0,seasonTicketDAO.getNumberOfTickets());
    }

    @Test
    void recordTicketEntry(){
        // Creating Object
        ISeasonTicket iSeasonTicket;
        IUsageRecordFactory factory = new IUsageRecordFactory() {
            @Override
            public IUsageRecord make(String ticketId, long startDateTime) {
                return null;
            }
        };
        SeasonTicketDAO seasonTicketDAO = new SeasonTicketDAO(factory);
        iSeasonTicket = seasonTicketDAO.findTicketById("736366336363");
        Assertions.assertThrows(RuntimeException.class, () -> {
            seasonTicketDAO.recordTicketEntry("1");
        });
    }

    @Test
    void recordTicketExit(){
        // Creating Object
        ISeasonTicket iSeasonTicket;
        IUsageRecordFactory factory = new IUsageRecordFactory() {
            @Override
            public IUsageRecord make(String ticketId, long startDateTime) {
                return null;
            }
        };
        SeasonTicketDAO seasonTicketDAO = new SeasonTicketDAO(factory);
        iSeasonTicket = seasonTicketDAO.findTicketById("736366336363");
        Assertions.assertThrows(RuntimeException.class, () -> {
            seasonTicketDAO.recordTicketExit("1"); //
        });
    }
}































