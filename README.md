# Which is the fastest?

[![Build Status](https://travis-ci.com/the-benchmarker/web-frameworks.svg?branch=master)](https://travis-ci.com/the-benchmarker/web-frameworks)
[![Join the chat at https://gitter.im/which_is_the_fastest/Lobby](https://badges.gitter.im/which_is_the_fastest/Lobby.svg)](https://gitter.im/which_is_the_fastest/Lobby)

This project aims to be a load benchmarking suite, no more, no less

> Measuring response times (routing times) for each framework (middleware).


<div align="center">
  :warning::warning::warning::warning::warning::warning::warning::warning:
</div>

<div align="center">Results are not <b>production-ready</b> <i>yet</i></div>

<div align="center">
  :warning::warning::warning::warning::warning::warning::warning::warning:
</div>

### Additional purposes :

+ Helping decide between languages, depending on use case
+ Learning languages, best practices, devops culture ...
+ Having fun :heart:

## Requirements

+ [Crystal](https://crystal-lang.org) as `built-in` tools are made in this language
+ [Docker](https://www.docker.com) as **frameworks** are `isolated` into _containers_
+ [wrk](https://github.com/wg/wrk) as benchmarking tool, `>= 4.1.0`

:information_source: you need `wrk` **stable**

~~~sh
git clone --branch 4.1.0 https://github.com/wg/wrk
~~~

:warning: `docker` is used for **development** purpose, `production` results will be computed on [DigitalOcean](https://www.digitalocean.com) :warning:

## Usage

+ Install all dependencies

~~~sh
shards install
~~~

+ Build internal tools

~~~sh
shards build
~~~

+ Build containers

> jobs are either languages (example : crystal) or frameworks (example : router.cr)

~~~sh
bin/neph [job1] [job2] [job3] ...
~~~

+ Start the benchmark ....

> tools is a list of language / framework to challenge (example : ruby kemal amber go python)

~~~sh
bin/benchmarker [tools]
~~~

## Results

<!-- Result from here -->
Last update: 2019-05-09
```
OS: Linux (version: 4.15.0-1032-aws, arch: x86_64)
CPU Cores: 16
```

### Latency


#### Ranking (top 5)


:one: nickel (rust)


:two: iron (rust)


:three: rocket (rust)


:four: japronto (python)


:five: actix-web (rust)


#### Full table

| Language (Runtime) | Framework (Middleware) | Average | 50th percentile | 90th percentile | 99th percentile | 99.9th percentile | Standard deviation |
|---------------------------|---------------------------|----------------:|----------------:|----------------:|----------------:|----------------:|----------------:|
| rust (1.34) | [nickel](http://nickel-org.github.io) (0.11) | 0.12 ms | 0.10 ms | 0.21 ms | 0.24 ms | 2.24 ms | 50.33 | 
| rust (1.34) | [iron](http://ironframework.io) (0.6) | 0.48 ms | 0.20 ms | 1.05 ms | 4.58 ms | 14.19 ms | 834.67 | 
| rust (nightly) | [rocket](http://rocket.rs) (0.4) | 5.64 ms | 0.99 ms | 2.81 ms | 158.48 ms | 1107.16 ms | 38110.67 | 
| python (3.7) | [japronto](http://github.com/squeaky-pl/japronto) (0.1) | 2.94 ms | 1.03 ms | 7.98 ms | 18.04 ms | 43.36 ms | 3922.33 | 
| rust (1.34) | [actix-web](http://actix.rs) (0.7) | 3.14 ms | 1.13 ms | 8.49 ms | 19.42 ms | 43.67 ms | 4166.33 | 
| ruby (2.6) | [roda](http://roda.jeremyevans.net) (3.19) | 2.57 ms | 1.20 ms | 6.66 ms | 11.96 ms | 33.02 ms | 2949.67 | 
| c (11) | [agoo-c](http://github.com/ohler55/agoo-c) (0.4) | 1.80 ms | 1.38 ms | 3.33 ms | 8.02 ms | 27.64 ms | 1584.00 | 
| cpp (11.0) | [evhtp](http://github.com/criticalstack/libevhtp) (1.2) | 3.42 ms | 1.41 ms | 9.62 ms | 20.36 ms | 47.38 ms | 4472.00 | 
| ruby (2.6) | [rack-routing](http://github.com/georgeu2000/rack-routing) (0.0) | 3.51 ms | 1.54 ms | 8.99 ms | 16.12 ms | 36.60 ms | 4003.00 | 
| crystal (0.27) | [spider-gazelle](http://spider-gazelle.net) (1.4) | 3.20 ms | 1.61 ms | 7.84 ms | 17.91 ms | 41.57 ms | 3749.00 | 
| crystal (0.27) | [onyx](http://onyxframework.org) (0.3) | 3.45 ms | 1.61 ms | 8.87 ms | 19.93 ms | 39.52 ms | 4221.00 | 
| ruby (2.6) | [rails](http://rubyonrails.org) (5.2) | 29.62 ms | 1.64 ms | 104.16 ms | 284.16 ms | 830.68 ms | 60589.00 | 
| python (3.6) | [vibora](http://vibora.io) (0.0) | 3.74 ms | 1.91 ms | 9.66 ms | 20.50 ms | 49.88 ms | 4450.00 | 
| go (1.12) | [fasthttprouter](http://godoc.org/github.com/buaazp/fasthttprouter) (0.1) | 2.59 ms | 2.01 ms | 4.65 ms | 8.48 ms | 37.92 ms | 1820.33 | 
| nim (0.19) | [jester](http://github.com/dom96/jester) (0.4) | 3.81 ms | 2.03 ms | 9.34 ms | 20.44 ms | 41.79 ms | 4392.67 | 
| c (99) | [kore](http://kore.io) (3.1) | 2.78 ms | 2.04 ms | 5.42 ms | 9.55 ms | 229.17 ms | 5738.67 | 
| ruby (2.6) | [agoo](http://github.com/ohler55/agoo) (2.8) | 11.34 ms | 2.13 ms | 46.71 ms | 97.46 ms | 114.09 ms | 23005.67 | 
| rust (1.34) | [gotham](http://gotham.rs) (0.3) | 3.20 ms | 2.26 ms | 6.42 ms | 15.36 ms | 93.04 ms | 3125.00 | 
| ruby (2.6) | [flame](http://github.com/AlexWayfer/flame) (4.18) | 5.08 ms | 2.72 ms | 13.01 ms | 23.95 ms | 52.86 ms | 5755.00 | 
| php (7.3) | [slim](http://slimframework.com) (3.12) | 39.77 ms | 2.76 ms | 88.80 ms | 571.02 ms | 2126.12 ms | 131773.00 | 
| php (7.3) | [symfony](http://symfony.com) (4.2) | 38.28 ms | 3.02 ms | 82.41 ms | 515.47 ms | 2035.80 ms | 122948.00 | 
| php (7.3) | [zend-expressive](http://zendframework.github.io/zend-expressive) (3.2) | 45.26 ms | 3.07 ms | 95.02 ms | 759.22 ms | 2645.43 ms | 157521.33 | 
| csharp (7.3) | [aspnetcore](http://docs.microsoft.com/en-us/aspnet/index) (2.2) | 3.73 ms | 3.36 ms | 6.25 ms | 13.80 ms | 103.88 ms | 3264.00 | 
| java (8) | [act](http://actframework.org) (1.8) | 4.88 ms | 3.38 ms | 9.89 ms | 18.80 ms | 113.14 ms | 4326.67 | 
| php (7.3) | [zend-framework](http://framework.zend.com) (3.1) | 61.82 ms | 3.39 ms | 114.32 ms | 1199.65 ms | 3582.10 ms | 250733.67 | 
| php (7.3) | [lumen](http://lumen.laravel.com) (5.8) | 53.48 ms | 3.60 ms | 111.49 ms | 1003.71 ms | 2816.70 ms | 190036.00 | 
| go (1.12) | [chi](http://github.com/go-chi/chi) (4.0) | 5.39 ms | 3.70 ms | 10.54 ms | 28.93 ms | 161.62 ms | 6030.67 | 
| go (1.12) | [echo](http://echo.labstack.com) (4.0) | 5.70 ms | 3.73 ms | 11.66 ms | 31.55 ms | 200.07 ms | 6887.33 | 
| go (1.12) | [gin](http://gin-gonic.com) (1.3) | 5.65 ms | 3.75 ms | 11.74 ms | 30.18 ms | 81.18 ms | 5780.00 | 
| go (1.12) | [gorilla-mux](http://www.gorillatoolkit.org/pkg/mux) (1.7) | 6.23 ms | 3.86 ms | 13.46 ms | 35.89 ms | 163.93 ms | 7143.33 | 
| go (1.12) | [kami](http://github.com/guregu/kami) (2.2) | 5.24 ms | 3.88 ms | 9.29 ms | 26.05 ms | 185.81 ms | 5302.33 | 
| go (1.12) | [beego](http://beego.me) (1.12) | 5.99 ms | 3.95 ms | 12.28 ms | 32.08 ms | 191.43 ms | 6568.67 | 
| node (12.1) | [restana](http://github.com/jkyberneees/ana) (2.13) | 5.34 ms | 3.96 ms | 8.43 ms | 19.70 ms | 82.21 ms | 3608.67 | 
| php (7.3) | [laravel](http://laravel.com) (5.8) | 78.48 ms | 3.97 ms | 139.16 ms | 1485.01 ms | 4613.09 ms | 297030.67 | 
| ruby (2.6) | [hanami](http://hanamirb.org) (1.3) | 6.18 ms | 4.12 ms | 15.22 ms | 27.30 ms | 62.72 ms | 6757.67 | 
| go (1.12) | [violetear](http://violetear.org) (7.0) | 6.28 ms | 4.16 ms | 12.74 ms | 35.04 ms | 205.66 ms | 7011.00 | 
| scala (2.12) | [akkahttp](http://akka.io) (10.1) | 21.62 ms | 4.39 ms | 8.72 ms | 656.10 ms | 1878.41 ms | 117763.33 | 
| go (1.12) | [gf](http://goframe.org) (1.6) | 8.55 ms | 4.86 ms | 20.36 ms | 51.00 ms | 199.08 ms | 10663.33 | 
| kotlin (1.3) | [ktor](http://ktor.io) (1.1) | 5.87 ms | 4.94 ms | 8.61 ms | 19.08 ms | 104.44 ms | 3513.67 | 
| node (12.1) | [polka](http://github.com/lukeed/polka) (0.5) | 6.28 ms | 5.38 ms | 9.67 ms | 20.61 ms | 142.11 ms | 4013.33 | 
| scala (2.12) | [http4s](http://http4s.org) (0.18) | 8.12 ms | 5.54 ms | 14.37 ms | 55.33 ms | 273.94 ms | 10496.33 | 
| node (12.1) | [rayo](http://rayo.js.org) (1.2) | 6.50 ms | 5.61 ms | 10.64 ms | 21.67 ms | 110.49 ms | 4173.00 | 
| node (12.1) | [fastify](http://fastify.io) (2.3) | 7.77 ms | 6.19 ms | 11.75 ms | 23.33 ms | 177.72 ms | 5806.33 | 
| ruby (2.6) | [sinatra](http://sinatrarb.com) (2.0) | 7.44 ms | 6.46 ms | 17.45 ms | 32.12 ms | 72.48 ms | 7670.33 | 
| node (12.1) | [muneem](http://github.com/node-muneem/muneem/) (2.4) | 7.90 ms | 6.80 ms | 13.06 ms | 25.95 ms | 226.14 ms | 6348.33 | 
| python (3.7) | [falcon](http://falconframework.org) (1.4) | 6.64 ms | 6.95 ms | 10.23 ms | 20.21 ms | 112.32 ms | 4130.33 | 
| python (3.7) | [bottle](http://bottlepy.org) (0.12) | 7.47 ms | 7.69 ms | 11.40 ms | 18.92 ms | 211.70 ms | 4909.33 | 
| node (12.1) | [foxify](http://foxify.js.org) (0.10) | 7.71 ms | 7.72 ms | 11.77 ms | 20.25 ms | 171.29 ms | 5198.67 | 
| node (12.1) | [koa](http://koajs.com) (2.7) | 8.29 ms | 7.78 ms | 12.08 ms | 20.65 ms | 149.39 ms | 4095.67 | 
| node (12.1) | [express](http://expressjs.com) (4.16) | 9.50 ms | 7.86 ms | 15.78 ms | 19.85 ms | 156.72 ms | 4297.67 | 
| python (3.7) | [hug](http://hug.rest) (2.4) | 9.74 ms | 7.87 ms | 15.85 ms | 22.16 ms | 148.93 ms | 4643.67 | 
| python (3.7) | [starlette](http://starlette.io) (0.11) | 9.49 ms | 7.94 ms | 14.36 ms | 20.11 ms | 48.02 ms | 3525.67 | 
| node (12.1) | [restify](http://restify.com) (8.2) | 10.57 ms | 11.27 ms | 12.08 ms | 20.76 ms | 128.38 ms | 3163.00 | 
| python (3.7) | [fastapi](http://fastapi.tiangolo.com) (0.16) | 14.13 ms | 12.69 ms | 22.52 ms | 32.11 ms | 64.12 ms | 6340.67 | 
| node (12.1) | [hapi](http://hapijs.com) (18.1) | 15.19 ms | 13.21 ms | 22.37 ms | 34.69 ms | 360.08 ms | 11972.67 | 
| python (3.7) | [aiohttp](http://aiohttp.readthedocs.io) (3.5) | 15.98 ms | 16.12 ms | 22.39 ms | 26.63 ms | 59.02 ms | 4771.00 |
| java (8) | [springboot](http://spring.io) (2.1.4) | 14.74 ms | 16.21 ms | 20.77 ms | 27.63 ms | 220.13 ms | 7967.33 | 
| python (3.7) | [molten](http://moltenframework.com) (0.7) | 18.80 ms | 17.20 ms | 27.79 ms | 42.28 ms | 303.00 ms | 9535.67 | 
| python (3.7) | [bocadillo](http://bocadilloproject.github.io) (0.13) | 18.58 ms | 18.33 ms | 30.38 ms | 39.96 ms | 67.95 ms | 7994.67 | 
| crystal (0.27) | [router.cr](http://github.com/tbrand/router.cr) (0.2) | 20.73 ms | 19.10 ms | 25.78 ms | 30.99 ms | 449.08 ms | 15191.67 | 
| python (3.7) | [flask](http://flask.pocoo.org) (1.0) | 19.93 ms | 19.58 ms | 30.34 ms | 41.29 ms | 228.18 ms | 7805.33 | 
| crystal (0.27) | [raze](http://razecr.com) (0.3) | 21.76 ms | 20.59 ms | 24.83 ms | 34.51 ms | 449.86 ms | 15263.67 | 
| crystal (0.27) | [kemal](http://kemalcr.com) (0.25) | 24.55 ms | 22.95 ms | 31.14 ms | 36.79 ms | 458.93 ms | 16322.33 | 
| python (3.7) | [sanic](http://github.com/huge-success/sanic) (19.3) | 27.19 ms | 23.57 ms | 49.65 ms | 81.43 ms | 168.74 ms | 16817.00 | 
| crystal (0.27) | [lucky](http://luckyframework.org) (0.11) | 25.50 ms | 23.85 ms | 35.98 ms | 39.08 ms | 405.98 ms | 13262.67 | 
| crystal (0.28) | [athena](http://github.com/blacksmoke16/athena) (0.6) | 28.17 ms | 26.74 ms | 33.34 ms | 35.01 ms | 456.44 ms | 15444.33 | 
| crystal (0.27) | [orion](http://github.com/obsidian/orion) (1.6) | 30.29 ms | 27.30 ms | 39.70 ms | 51.65 ms | 463.01 ms | 17990.67 | 
| crystal (0.27) | [amber](http://amberframework.org) (0.11) | 30.02 ms | 28.35 ms | 36.00 ms | 37.77 ms | 461.15 ms | 16049.33 | 
| python (3.7) | [quart](http://pgjones.gitlab.io/quart) (0.8) | 36.40 ms | 33.29 ms | 59.86 ms | 74.68 ms | 100.17 ms | 15025.67 | 
| python (3.7) | [responder](http://python-responder.org) (1.3) | 45.00 ms | 43.76 ms | 62.92 ms | 77.62 ms | 135.74 ms | 13091.33 | 
| python (3.7) | [django](http://djangoproject.com) (2.2) | 48.06 ms | 46.60 ms | 55.39 ms | 100.46 ms | 346.13 ms | 14140.33 | 
| python (3.7) | [tornado](http://tornadoweb.org) (5.1) | 48.45 ms | 47.89 ms | 62.65 ms | 69.31 ms | 320.70 ms | 10175.67 | 

### Requests per seconds


#### Ranking (top 5)


:one: (agoo-c) (c)


:two: (japronto) (python)


:three: (actix-web) (rust)


:four: (evhtp) (cpp)


:five: (kore) (c)


#### Full table

| Language (Runtime) | Framework (Middleware) | Requests / s | Throughput |
|---------------------------|---------------------------|----------------:|---------:|
| c (11) | [agoo-c](http://github.com/ohler55/agoo-c) (0.4) | 571020.33 | 330.08 MB |
| python (3.7) | [japronto](http://github.com/squeaky-pl/japronto) (0.1) | 505817.33 | 605.75 MB |
| rust (1.34) | [actix-web](http://actix.rs) (0.7) | 467351.00 | 531.09 MB |
| cpp (11.0) | [evhtp](http://github.com/criticalstack/libevhtp) (1.2) | 432224.67 | 419.66 MB |
| c (99) | [kore](http://kore.io) (3.1) | 415711.67 | 1080.84 MB |
| crystal (0.27) | [spider-gazelle](http://spider-gazelle.net) (1.4) | 397362.67 | 424.06 MB |
| crystal (0.27) | [onyx](http://onyxframework.org) (0.3) | 395220.00 | 371.66 MB |
| nim (0.19) | [jester](http://github.com/dom96/jester) (0.4) | 390486.33 | 785.10 MB |
| python (3.6) | [vibora](http://vibora.io) (0.0) | 390123.00 | 442.93 MB |
| go (1.12) | [fasthttprouter](http://godoc.org/github.com/buaazp/fasthttprouter) (0.1) | 377876.00 | 608.02 MB |
| ruby (2.6) | [agoo](http://github.com/ohler55/agoo) (2.8) | 344820.67 | 199.33 MB |
| rust (1.34) | [gotham](http://gotham.rs) (0.3) | 334806.33 | 685.20 MB |
| java (8) | [act](http://actframework.org) (1.8) | 301212.67 | 520.34 MB |
| csharp (7.3) | [aspnetcore](http://docs.microsoft.com/en-us/aspnet/index) (2.2) | 261450.00 | 426.00 MB |
| rust (1.34) | [iron](http://ironframework.io) (0.6) | 221294.67 | 280.18 MB |
| go (1.12) | [chi](http://github.com/go-chi/chi) (4.0) | 212747.67 | 284.96 MB |
| go (1.12) | [kami](http://github.com/guregu/kami) (2.2) | 207386.67 | 276.16 MB |
| go (1.12) | [gin](http://gin-gonic.com) (1.3) | 205823.67 | 361.51 MB |
| go (1.12) | [echo](http://echo.labstack.com) (4.0) | 205740.00 | 361.36 MB |
| go (1.12) | [gorilla-mux](http://www.gorillatoolkit.org/pkg/mux) (1.7) | 197338.00 | 263.72 MB |
| go (1.12) | [beego](http://beego.me) (1.12) | 195581.33 | 263.35 MB |
| node (12.1) | [restana](http://github.com/jkyberneees/ana) (2.13) | 190211.33 | 285.15 MB |
| go (1.12) | [violetear](http://violetear.org) (7.0) | 188540.00 | 250.80 MB |
| kotlin (1.3) | [ktor](http://ktor.io) (1.1) | 169794.67 | 264.86 MB |
| scala (2.12) | [akkahttp](http://akka.io) (10.1) | 168757.67 | 362.52 MB |
| node (12.1) | [polka](http://github.com/lukeed/polka) (0.5) | 159847.67 | 239.62 MB |
| go (1.12) | [gf](http://goframe.org) (1.6) | 155374.00 | 235.92 MB |
| node (12.1) | [rayo](http://rayo.js.org) (1.2) | 155125.00 | 232.62 MB |
| scala (2.12) | [http4s](http://http4s.org) (0.18) | 153655.67 | 269.67 MB |
| python (3.7) | [falcon](http://falconframework.org) (1.4) | 150068.67 | 385.98 MB |
| php (7.3) | [symfony](http://symfony.com) (4.2) | 144285.00 | 718.39 MB |
| php (7.3) | [slim](http://slimframework.com) (3.12) | 143716.33 | 715.17 MB |
| php (7.3) | [zend-expressive](http://zendframework.github.io/zend-expressive) (3.2) | 143167.00 | 712.23 MB |
| php (7.3) | [zend-framework](http://framework.zend.com) (3.1) | 140070.67 | 697.22 MB |
| node (12.1) | [fastify](http://fastify.io) (2.3) | 137436.67 | 364.51 MB |
| node (12.1) | [muneem](http://github.com/node-muneem/muneem/) (2.4) | 134457.33 | 201.57 MB |
| python (3.7) | [bottle](http://bottlepy.org) (0.12) | 132579.67 | 326.71 MB |
| node (12.1) | [foxify](http://foxify.js.org) (0.10) | 129112.67 | 271.54 MB |
| rust (1.34) | [nickel](http://nickel-org.github.io) (0.11) | 128407.33 | 255.33 MB |
| php (7.3) | [lumen](http://lumen.laravel.com) (5.8) | 125653.00 | 654.15 MB |
| node (12.1) | [koa](http://koajs.com) (2.7) | 118583.33 | 251.19 MB |
| php (7.3) | [laravel](http://laravel.com) (5.8) | 114898.67 | 598.73 MB |
| node (12.1) | [express](http://expressjs.com) (4.16) | 102972.33 | 252.33 MB |
| python (3.7) | [starlette](http://starlette.io) (0.11) | 102418.67 | 220.79 MB |
| python (3.7) | [hug](http://hug.rest) (2.4) | 100462.00 | 249.18 MB |
| ruby (2.6) | [roda](http://roda.jeremyevans.net) (3.19) | 98906.33 | 94.54 MB |
| rust (nightly) | [rocket](http://rocket.rs) (0.4) | 96930.00 | 153.26 MB |
| node (12.1) | [restify](http://restify.com) (8.2) | 91551.33 | 160.78 MB |
| ruby (2.6) | [rack-routing](http://github.com/georgeu2000/rack-routing) (0.0) | 72916.33 | 42.18 MB |
| python (3.7) | [fastapi](http://fastapi.tiangolo.com) (0.16) | 70541.00 | 152.36 MB |
| node (12.1) | [hapi](http://hapijs.com) (18.1) | 69166.33 | 179.58 MB |
| java (8) | [springboot](http://spring.io) (2.1.4) | 66323.33 | 113.59 MB |
| python (3.7) | [aiohttp](http://aiohttp.readthedocs.io) (3.5) | 61392.00 | 139.23 MB |
| python (3.7) | [molten](http://moltenframework.com) (0.7) | 53927.00 | 100.33 MB |
| python (3.7) | [bocadillo](http://bocadilloproject.github.io) (0.13) | 52983.33 | 102.28 MB |
| ruby (2.6) | [flame](http://github.com/AlexWayfer/flame) (4.18) | 50357.00 | 29.13 MB |
| python (3.7) | [flask](http://flask.pocoo.org) (1.0) | 49577.00 | 122.11 MB |
| crystal (0.27) | [router.cr](http://github.com/tbrand/router.cr) (0.2) | 48236.33 | 45.32 MB |
| crystal (0.27) | [raze](http://razecr.com) (0.3) | 45584.67 | 42.86 MB |
| ruby (2.6) | [hanami](http://hanamirb.org) (1.3) | 41341.00 | 313.31 MB |
| crystal (0.27) | [kemal](http://kemalcr.com) (0.25) | 40136.33 | 65.59 MB |
| crystal (0.27) | [lucky](http://luckyframework.org) (0.11) | 38350.67 | 47.29 MB |
| python (3.7) | [sanic](http://github.com/huge-success/sanic) (19.3) | 37500.33 | 66.96 MB |
| crystal (0.28) | [athena](http://github.com/blacksmoke16/athena) (0.6) | 34875.00 | 43.39 MB |
| ruby (2.6) | [sinatra](http://sinatrarb.com) (2.0) | 34422.67 | 89.53 MB |
| crystal (0.27) | [amber](http://amberframework.org) (0.11) | 32817.00 | 60.06 MB |
| crystal (0.27) | [orion](http://github.com/obsidian/orion) (1.6) | 32617.33 | 53.28 MB |
| python (3.7) | [quart](http://pgjones.gitlab.io/quart) (0.8) | 27066.00 | 54.07 MB |
| python (3.7) | [responder](http://python-responder.org) (1.3) | 21820.00 | 47.68 MB |
| python (3.7) | [django](http://djangoproject.com) (2.2) | 20355.00 | 59.11 MB |
| python (3.7) | [tornado](http://tornadoweb.org) (5.1) | 20103.67 | 59.47 MB |
| ruby (2.6) | [rails](http://rubyonrails.org) (5.2) | 10329.67 | 31.80 MB |
<!-- Result till here -->

## How to contribute ?

In any way you want ...

+ Request a framework addition
+ Report a bug (on any implementation)
+ Suggest an idea
+ ...

Any kind of idea is :heart:

## Contributors

- [Taichiro Suzuki](https://github.com/tbrand) - Author | Maintainer
- [OvermindDL1](https://github.com/OvermindDL1) - Maintainer
- [Marwan Rabbâa](https://github.com/waghanza) - Maintainer
