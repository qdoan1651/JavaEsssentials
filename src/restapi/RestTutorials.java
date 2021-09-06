package restapi;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

public class RestTutorials {

	public static void main(String[] args) throws ClientProtocolException, IOException {
		getRequest();

	}
	
	public static void example2a() {
		// http://alvinalexander.com/java/java-apache-httpclient-restful-client-examples
		HttpClient httpClient = new DefaultHttpClient();
	    try {
	      // this twitter call returns json results.
	      // see this page for more info: https://dev.twitter.com/docs/using-search
	      // http://search.twitter.com/search.json?q=%40apple

	      // Example URL 1: this yahoo weather call returns results as an rss (xml) feed
	      //HttpGet httpGetRequest = new HttpGet("http://weather.yahooapis.com/forecastrss?p=80020&u=f");
	      
	      // Example URL 2: this twitter api call returns results in a JSON format
	      HttpGet httpGetRequest = new HttpGet("http://search.twitter.com/search.json?q=%40apple");

	      // Execute HTTP request
	      HttpResponse httpResponse = httpClient.execute(httpGetRequest);

	      System.out.println("----------------------------------------");
	      System.out.println(httpResponse.getStatusLine());
	      System.out.println("----------------------------------------");

	      // Get hold of the response entity
	      HttpEntity entity = httpResponse.getEntity();

	      // If the response does not enclose an entity, there is no need
	      // to bother about connection release
	      byte[] buffer = new byte[1024];
	      if (entity != null) {
	        InputStream inputStream = entity.getContent();
	        try {
	          int bytesRead = 0;
	          BufferedInputStream bis = new BufferedInputStream(inputStream);
	          while ((bytesRead = bis.read(buffer)) != -1) {
	            String chunk = new String(buffer, 0, bytesRead);
	            System.out.println(chunk);
	          }
	        } catch (IOException ioException) {
	          // In case of an IOException the connection will be released
	          // back to the connection manager automatically
	          ioException.printStackTrace();
	        } catch (RuntimeException runtimeException) {
	          // In case of an unexpected exception you may want to abort
	          // the HTTP request in order to shut down the underlying
	          // connection immediately.
	          httpGetRequest.abort();
	          runtimeException.printStackTrace();
	        } finally {
	          // Closing the input stream will trigger connection release
	          try {
	            inputStream.close();
	          } catch (Exception ignore) {
	          }
	        }
	      }
	    } catch (ClientProtocolException e) {
	      // thrown by httpClient.execute(httpGetRequest)
	      e.printStackTrace();
	    } catch (IOException e) {
	      // thrown by entity.getContent();
	      e.printStackTrace();
	    } finally {
	      // When HttpClient instance is no longer needed,
	      // shut down the connection manager to ensure
	      // immediate deallocation of all system resources
	      httpClient.getConnectionManager().shutdown();
	    }
	}
	
	public static void example2b() {
		// http://alvinalexander.com/java/java-apache-httpclient-restful-client-examples
		HttpClient httpClient = new DefaultHttpClient();
	    try {
	      HttpGet httpGetRequest = new HttpGet("http://search.twitter.com/search.json?q=%40apple");
	      HttpResponse httpResponse = httpClient.execute(httpGetRequest);

	      System.out.println("----------------------------------------");
	      System.out.println(httpResponse.getStatusLine());
	      System.out.println("----------------------------------------");

	      HttpEntity entity = httpResponse.getEntity();

	      byte[] buffer = new byte[1024];
	      if (entity != null) {
	        InputStream inputStream = entity.getContent();
	        try {
	          int bytesRead = 0;
	          BufferedInputStream bis = new BufferedInputStream(inputStream);
	          while ((bytesRead = bis.read(buffer)) != -1) {
	            String chunk = new String(buffer, 0, bytesRead);
	            System.out.println(chunk);
	          }
	        } catch (Exception e) {
	          e.printStackTrace();
	        } finally {
	          try { inputStream.close(); } catch (Exception ignore) {}
	        }
	      }
	    } catch (Exception e) {
	      e.printStackTrace();
	    } finally {
	      httpClient.getConnectionManager().shutdown();
	    }
	}
	public static void example1() {
		// http://alvinalexander.com/java/java-apache-httpclient-restful-client-examples
		/**
		 * A simple Java REST GET example using the Apache HTTP library.
		 * This executes a call against the Yahoo Weather API service, which is
		 * actually an RSS service (http://developer.yahoo.com/weather/).
		 * 
		 * Try this Twitter API URL for another example (it returns JSON results):
		 * http://search.twitter.com/search.json?q=%40apple
		 * (see this url for more twitter info: https://dev.twitter.com/docs/using-search)
		 * 
		 * Apache HttpClient: http://hc.apache.org/httpclient-3.x/
		 *
		 */
		DefaultHttpClient httpclient = new DefaultHttpClient();
	    try {
	      // specify the host, protocol, and port
	      HttpHost target = new HttpHost("weather.yahooapis.com", 80, "http");
	      
	      // specify the get request
	      HttpGet getRequest = new HttpGet("/forecastrss?p=80020&u=f");

	      System.out.println("executing request to " + target);

	      HttpResponse httpResponse = httpclient.execute(target, getRequest);
	      HttpEntity entity = httpResponse.getEntity();

	      System.out.println("----------------------------------------");
	      System.out.println(httpResponse.getStatusLine());
	      Header[] headers = httpResponse.getAllHeaders();
	      for (int i = 0; i < headers.length; i++) {
	        System.out.println(headers[i]);
	      }
	      System.out.println("----------------------------------------");

	      if (entity != null) {
	        System.out.println(EntityUtils.toString(entity));
	      }

	    } catch (Exception e) {
	      e.printStackTrace();
	    } finally {
	      // When HttpClient instance is no longer needed,
	      // shut down the connection manager to ensure
	      // immediate deallocation of all system resources
	      httpclient.getConnectionManager().shutdown();
	    }
	}
	
	public static void getRequest() throws ClientProtocolException, IOException {
		// https://www.javacodegeeks.com/2012/09/simple-rest-client-in-java.html
		HttpClient client = new DefaultHttpClient();
		//HttpGet request = new HttpGet("https://clue-static.cengage.com/game-assets25/MathNinja/datasets/Lesson/f1/math.json");
		HttpGet request = new HttpGet("https://clue-static.cengage.com/game-assets25/MathNinja/datasets/Lesson/f1/dataset.json");
		HttpResponse response = client.execute(request);
		BufferedReader rd = new BufferedReader (new InputStreamReader(response.getEntity().getContent()));
		String line = "";
		while ((line = rd.readLine()) != null) {
			System.out.println(line);
		}
	}
	
	public static void postRequest() throws ClientProtocolException, IOException {
		// https://www.javacodegeeks.com/2012/09/simple-rest-client-in-java.html
		HttpClient client = new DefaultHttpClient();
		HttpPost post = new HttpPost("");
		StringEntity input = new StringEntity("product");
		post.setEntity(input);
		HttpResponse response = client.execute(post);
		BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
		String line = "";
		while ((line = rd.readLine()) != null) {
		   System.out.println(line);
		}
	}

}
