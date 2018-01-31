/*********************************************************
 * 2017fall CSE 682 Project
 * Title: FindIt
 * Purpose: A restaurant recommendation web application
 * Group Leader: Chunyang Zhan
 * Group Member: Xiling Wang, Honghao An, Chenyang Du, Yue Zhao
 * 				 Haiyang Zhang, Yufei Fang
 * 
 * Version 1.1
 * Updated Factory pattern, added Ticketmaster API as test
 * 
 * Version History:
 * Version 1.0: Implement main functionality
 * 
 *********************************************************/

package external;

public class ExternalAPIFactory {
    private static final String DEFAULT_PIPELINE = "restaurant";

    // Start different APIs based on the pipeline.
    public static ExternalAPI getExternalAPI(String pipeline) {
        switch (pipeline) {
        case "restaurant":
                                           // return new YelpAPI(); 
            return new YelpAPI();
        case "job":
                                           // return new LinkedInAPI(); 
            return null;
        case "new":
                                           // return new NewYorkTimesAPI(); 
            return null;
        case "ticketmaster":
            return new TicketMasterAPI();
        default:
            throw new IllegalArgumentException("Invalid pipeline " + pipeline);
        }
    }

    public static ExternalAPI getExternalAPI() {
        return getExternalAPI(DEFAULT_PIPELINE);
    }
}