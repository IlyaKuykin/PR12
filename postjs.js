function sendPost(url, data) {
    return fetch(url, {
      method: 'POST',
      body: data
    })
    .then(response => response.text())
    .catch(error => console.error(error));
  }
  