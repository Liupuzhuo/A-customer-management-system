# Stage 1: Build Angular static assets
FROM node:18-alpine as node
LABEL author="shanhuyun"

WORKDIR /app
COPY package*.json /app/

RUN npm config set registry https://registry.npmmirror.com && \
    npm install
COPY ./ /app/
RUN npm run build

# Stage 2: Serve Angular assets using NGINX
FROM nginx:1.15.2-alpine
LABEL author="shanhuyun"

# Set timezone to UTC+8
RUN apk add --no-cache tzdata && \
    ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime && \
    echo "Asia/Shanghai" > /etc/timezone

# Copy custom nginx config
COPY ./nginx.conf /etc/nginx/nginx.conf
COPY --from=node /app/dist /usr/share/nginx/html
EXPOSE 80 443
ENTRYPOINT ["nginx", "-g", "daemon off;"]