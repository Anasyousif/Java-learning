import java.util.List;

public class PaginationHelper<I> {

  private List<I> collection;
  private int itemsPerPage;

  /**
   * The constructor takes in an array of items and an integer indicating how many
   * items fit within a single page.
   */
  public PaginationHelper(List<I> collection, int itemsPerPage) {
    this.collection = collection;
    this.itemsPerPage = itemsPerPage;
  }

  /**
   * Returns the number of items within the entire collection.
   */
  public int itemCount() {
    return collection.size();
  }

  /**
   * Returns the number of pages.
   */
  public int pageCount() {
    int totalItems = collection.size();
    return (totalItems + itemsPerPage - 1) / itemsPerPage; // Integer division rounding up
  }

  /**
   * Returns the number of items on the current page. pageIndex is zero-based.
   * This method should return -1 for pageIndex values that are out of range.
   */
  public int pageItemCount(int pageIndex) {
    int totalPages = pageCount();
    if (pageIndex < 0 || pageIndex >= totalPages) {
      return -1; // Invalid page index
    }
    
    // If it's the last page, return the remaining items
    if (pageIndex == totalPages - 1) {
      return collection.size() % itemsPerPage == 0 ? itemsPerPage : collection.size() % itemsPerPage;
    }
    
    return itemsPerPage;
  }

  /**
   * Determines what page an item is on. Zero-based indexes.
   * This method should return -1 for itemIndex values that are out of range.
   */
  public int pageIndex(int itemIndex) {
    int totalItems = collection.size();
    if (itemIndex < 0 || itemIndex >= totalItems) {
      return -1; // Invalid item index
    }
    
    return itemIndex / itemsPerPage; // Return the page number (zero-based)
  }
}
