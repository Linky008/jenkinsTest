FROM mcr.microsoft.com/dotnet/core/aspnet:2.2-stretch-slim AS base
WORKDIR /app
EXPOSE 80
EXPOSE 443

FROM mcr.microsoft.com/dotnet/core/sdk:2.2-stretch AS build
WORKDIR /src
COPY ["CoreWeb/CoreWeb.csproj", "CoreWeb/"]
RUN dotnet restore "CoreWeb/CoreWeb.csproj"
COPY . .
WORKDIR "/src/CoreWeb"
RUN dotnet build "CoreWeb.csproj" -c Release -o /app

FROM build AS publish
RUN dotnet publish "CoreWeb.csproj" -c Release -o /app

FROM base AS final
WORKDIR /app
COPY --from=publish /app .
ENTRYPOINT ["dotnet", "CoreWeb.dll"]