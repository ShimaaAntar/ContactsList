
# Contacts List
A practice to recycle view by Java 


## What is the RecyclerView?

RecyclerView makes it simple to display vast amounts of data. You provide the data and describe how each item should look, and the RecyclerView module automatically produces the elements as needed. This enhancement is accomplished by recycling views that are not visible to the user. For example, if a user scrolled down to see items 4 and 5, items 1, 2, and 3 would be deleted from memory to reduce memory use


##  Adapter:
The adapter handling the data collection and binding it to the view, serves as a link between the data source and the UI component, enabling us to fill the UI component with data. It keeps the data and sends the data to an adapter view, which can then take the data and show it on other views, such as a list view.
‏
## -onCreateViewHolder():
This function is called whenever a new ViewHolder is required. The function builds and initialises the ViewHolder and its associated View, but does not populate the view .
## -onBindViewHolder():
This function is called by RecyclerView to associate a ViewHolder with data. The method retrieves the necessary data and utilises it to populate the view holder's layout. If the RecyclerView displays a list of names, for example, the function may select the appropriate name in the list and fill up the view holder's TextView widget
## -getItemCount():
To determine the amount of the dataset, RecyclerView invokes this function. For instance, this may be the total amount of addresses in an address book app. This is used by RecyclerView to decide when no more items can be displayed.


