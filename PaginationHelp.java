import java.util.List;
import java.util.Arrays;
public class PaginationHelp<I> {

     private final List<I> collection;
    private final int itemsPerPage;

    /**
     * The constructor takes in an array of items and a integer indicating how many
     * items fit within a single page
     */
    public PaginationHelp(List<I> collection, int itemsPerPage) {
        this.collection = collection;
        this.itemsPerPage = itemsPerPage;
}

    // --- Utility Methods ---

    /**
     * returns the number of items within the entire collection
     */
    public int itemCount() {
        return collection.size();
    }

    /**
     * returns the number of pages
     */
    public int pageCount() {
        if (itemCount() == 0 || itemsPerPage <= 0) {
            return 0; // Handle empty collection or invalid itemsPerPage
        }
        // Integer division will truncate the result.
        // The addition of (itemsPerPage - 1) before division is a common trick
        // to implement the ceiling function: ceil(a / b) = (a + b - 1) / b
        return (itemCount() + itemsPerPage - 1) / itemsPerPage;
    }

    /**
     * returns the number of items on the current page. pageIndex is zero based.
     * this method should return -1 for pageIndex values that are out of range
     */
    public int pageItemCount(int pageIndex) {
        int totalPages = pageCount();

        // 1. Check if the pageIndex is out of range (including negative)
        if (pageIndex < 0 || pageIndex >= totalPages) {
            return -1;
        }

        // 2. Check if it's the last page
        if (pageIndex == totalPages - 1) {
            // For the last page, the count is the total items modulo itemsPerPage.
            // If modulo is 0 (i.e., the last page is full), the count is itemsPerPage.
            int lastPageCount = itemCount() % itemsPerPage;
            return lastPageCount == 0 && itemCount() > 0 ? itemsPerPage : lastPageCount;
        }

        // 3. For any other page, it must be full
        return itemsPerPage;
    }

    /**
     * determines what page an item is on. Zero based indexes
     * this method should return -1 for itemIndex values that are out of range
     */
    public int pageIndex(int itemIndex) {
        // 1. Check if the itemIndex is out of range
        if (itemIndex < 0 || itemIndex >= itemCount()) {
            return -1;
        }

        // 2. The page index is simply the item index divided by items per page.
        // This is due to zero-based indexing and integer division's truncation.
        // Example: Item 0, 1, 2, 3 (with 4 per page) are all on page 0.
        // 0/4=0, 1/4=0, 2/4=0, 3/4=0.
        // Item 4, 5, 6, 7 are on page 1.
        // 4/4=1, 5/4=1, 6/4=1, 7/4=1.
        return itemIndex / itemsPerPage;
    }
}
