You start the application from the GasStationServiceApplication class.
When you start the application it will automatically create a mysql scheme with a GasStation table and initialize
all of the gas stations from the given link in the assignment. All of that happens in the GasStationService
by reading the URL with an inputstreamreader and saving the Json in a dto array of dto gas stations using the GSON library.
I filter only the gas stations which are open and map them using the MODELMAPPER library.

You can search by name using the get request:
<img src="https://i.postimg.cc/Qt7fTQnf/search-Img.png"> alt="searchImg"
http://localhost:8080/gas-station/search/demo

You can also get the median, minimum and maximum stats of these three fuel types: diesel, e5, e10. using there get requests:
<img src="https://i.postimg.cc/HLGvzPDQ/getPrice.jpg" alt="getPrice">

http://localhost:8080/gas-station/gas-price/minimum/diesel

http://localhost:8080/gas-station/gas-price/maximum/e5

http://localhost:8080/gas-station/gas-price/median/e10


