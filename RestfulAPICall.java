HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
          .uri(URI.create("www.example.com/api/get/1"))
          .build();

    HttpResponse<String> response =
          client.send(request, BodyHandlers.ofString());

    System.out.println(response.body());