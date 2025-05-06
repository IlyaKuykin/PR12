function sendGet(url) {
    return new Promise((resolve, reject) => {
      const xhr = new XMLHttpRequest();
      xhr.open('GET', url);
      xhr.onload = function() {
        if (xhr.status === 200) {
          resolve(xhr.responseText);
        } else {
          reject(new Error('Request failed. Error code: ' + xhr.status));
        }
      };
      xhr.onerror = function() {
        reject(new Error('Network error'));
      };
      xhr.send();
    });
  }
  